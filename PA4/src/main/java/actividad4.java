public class actividad4 {

    public static String[] lugares = {"Entrada", "Biblioteca", "Cafeteria", "Laboratorio", "Aulas"};

    // Costo real de cada tramo (0 = sin conexion directa)
    public static int[][] costos = {
        //  Ent Bib Caf Lab Aul
        {0, 2, 2, 0, 0},  // Entrada
        {2, 0, 0, 3, 0},  // Biblioteca
        {2, 0, 0, 0, 3},  // Cafeteria
        {0, 3, 0, 0, 4},  // Laboratorio
        {0, 0, 3, 4, 0}   // Aulas
    };

    // Heuristica h(n): distancia estimada hasta Aulas (indice 4)
    public static int[] heuristica = {5, 6, 3, 4, 0};

    public static int explorados;

    // ACTIVIDAD 1: validacion recursiva del destino
    public static int buscarLugar(String nombre, int indice) {
        if (indice >= lugares.length) return -1;                       // caso base: no existe
        if (lugares[indice].equalsIgnoreCase(nombre)) return indice;   // caso base: encontrado
        return buscarLugar(nombre, indice + 1);                        // caso recursivo
    }

    // ACTIVIDAD 2: Merge Sort aplicado a las rutas
    public static String[] nombres = {"DFS", "BFS", "A*"};
    public static int[] costo = new int[3];   // costo total de cada ruta
    public static int[] nodos = new int[3];   // nodos explorados por cada ruta

    // true si la ruta a es mejor o igual que la ruta b:
    // menor costo; si empatan, la que explora menos nodos
    public static boolean esMejor(int a, int b) {
        if (costo[a] != costo[b]) return costo[a] < costo[b];
        return nodos[a] <= nodos[b];
    }

    public static String grupo(int[] arr, int desde, int hasta) {
        String s = "[";
        for (int i = desde; i <= hasta; i++) {
            s += nombres[arr[i]] + (i < hasta ? ", " : "");
        }
        return s + "]";
    }

    public static void mergeSort(int[] orden, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            System.out.println("Dividimos: " + grupo(orden, inicio, fin) + " en "
                    + grupo(orden, inicio, medio) + " y " + grupo(orden, medio + 1, fin));
            mergeSort(orden, inicio, medio);
            mergeSort(orden, medio + 1, fin);
            mezclar(orden, inicio, medio, fin);
        }
    }

    public static void mezclar(int[] orden, int inicio, int medio, int fin) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;
        int[] izq = new int[n1];
        int[] der = new int[n2];

        for (int i = 0; i < n1; i++) izq[i] = orden[inicio + i];
        for (int j = 0; j < n2; j++) der[j] = orden[medio + 1 + j];

        String antes = grupo(izq, 0, n1 - 1) + " y " + grupo(der, 0, n2 - 1);

        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (esMejor(izq[i], der[j])) orden[k++] = izq[i++];
            else orden[k++] = der[j++];
        }
        while (i < n1) orden[k++] = izq[i++];
        while (j < n2) orden[k++] = der[j++];

        System.out.println("Juntamos : " + antes + " -> " + grupo(orden, inicio, fin));
    }

    // ACTIVIDAD 3: DFS recursivo que busca una ruta hasta la meta
    public static boolean dfs(int actual, int meta, boolean[] visitado, int[] padre) {
        visitado[actual] = true;
        explorados++;
        if (actual == meta) return true;
        for (int i = 0; i < lugares.length; i++) {
            if (costos[actual][i] > 0 && !visitado[i]) {
                padre[i] = actual;
                if (dfs(i, meta, visitado, padre)) return true;
            }
        }
        return false;
    }

    // ACTIVIDAD 3: BFS (ruta con menos tramos)
    public static void bfs(int inicio, int meta, int[] padre) {
        boolean[] visitado = new boolean[lugares.length];
        int[] cola = new int[lugares.length];
        int front = 0, rear = 0;
        cola[rear++] = inicio;
        visitado[inicio] = true;

        while (front < rear) {
            int actual = cola[front++];
            explorados++;
            if (actual == meta) return;
            for (int i = 0; i < lugares.length; i++) {
                if (costos[actual][i] > 0 && !visitado[i]) {
                    visitado[i] = true;
                    padre[i] = actual;
                    cola[rear++] = i;
                }
            }
        }
    }

    // ACTIVIDAD 3: A* con f(n) = g(n) + h(n)
    public static void aStar(int inicio, int meta, int[] padre) {
        int n = lugares.length;
        int[] g = new int[n];
        int[] f = new int[n];
        boolean[] cerrado = new boolean[n];

        for (int i = 0; i < n; i++) {
            g[i] = Integer.MAX_VALUE;
            f[i] = Integer.MAX_VALUE;
        }
        g[inicio] = 0;
        f[inicio] = heuristica[inicio];

        while (true) {
            int actual = -1;
            int menorF = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (!cerrado[i] && g[i] != Integer.MAX_VALUE && f[i] < menorF) {
                    menorF = f[i];
                    actual = i;
                }
            }
            if (actual == -1) return;
            explorados++;
            if (actual == meta) return;

            cerrado[actual] = true;
            for (int v = 0; v < n; v++) {
                if (costos[actual][v] > 0 && !cerrado[v]) {
                    int nuevoG = g[actual] + costos[actual][v];
                    if (nuevoG < g[v]) {
                        g[v] = nuevoG;
                        f[v] = nuevoG + heuristica[v];
                        padre[v] = actual;
                    }
                }
            }
        }
    }

    public static String construirRuta(int[] padre, int meta) {
        String ruta = "";
        for (int c = meta; c != -1; c = padre[c]) {
            ruta = lugares[c] + (ruta.isEmpty() ? "" : " -> " + ruta);
        }
        return ruta;
    }

    public static int costoRuta(int[] padre, int meta) {
        int total = 0;
        for (int c = meta; padre[c] != -1; c = padre[c]) {
            total += costos[padre[c]][c];
        }
        return total;
    }

    public static int[] nuevoPadre() {
        int[] p = new int[lugares.length];
        for (int i = 0; i < p.length; i++) p[i] = -1;
        return p;
    }

    public static void main(String[] args) {
        String destino = "Aulas";

        // PASO 1 - Actividad 1: validar el destino con recursividad
        System.out.println("PASO 1 (Actividad 1): validar destino");
        int meta = buscarLugar(destino, 0);
        if (meta == -1) {
            System.out.println("Error: '" + destino + "' no pertenece al campus.");
            return;
        }
        System.out.println("Destino valido -> " + lugares[meta]);
        int inicio = 0;

        // PASO 2 - Actividad 3: buscar una ruta con cada algoritmo
        int[][] padres = new int[3][];

        explorados = 0;
        padres[0] = nuevoPadre();
        dfs(inicio, meta, new boolean[lugares.length], padres[0]);
        nodos[0] = explorados;

        explorados = 0;
        padres[1] = nuevoPadre();
        bfs(inicio, meta, padres[1]);
        nodos[1] = explorados;

        explorados = 0;
        padres[2] = nuevoPadre();
        aStar(inicio, meta, padres[2]);
        nodos[2] = explorados;

        System.out.println("\nPASO 2 (Actividad 3): rutas encontradas");
        for (int i = 0; i < 3; i++) {
            costo[i] = costoRuta(padres[i], meta);
            System.out.println(nombres[i] + " : " + construirRuta(padres[i], meta)
                    + " | costo " + costo[i] + " | nodos explorados " + nodos[i]);
        }

        // PASO 3 - Actividad 2: ordenar las rutas con Merge Sort
        System.out.println("\nPASO 3 (Actividad 2): ordenar rutas con Merge Sort (menor costo primero)");
        int[] orden = {0, 1, 2};
        System.out.println("Lista inicial: " + grupo(orden, 0, 2));
        mergeSort(orden, 0, orden.length - 1);
        System.out.println("Lista final  : " + grupo(orden, 0, 2));

        // PASO 4 - Actividad 4: recomendacion
        System.out.println("\nPASO 4 (Actividad 4): ranking y recomendacion");
        for (int p = 0; p < 3; p++) {
            int a = orden[p];
            System.out.println((p + 1) + ". " + nombres[a] + " | costo " + costo[a]
                    + " | nodos explorados " + nodos[a]);
        }
        System.out.println("Se recomienda " + nombres[orden[0]]
                + ": tiene el menor costo y explora menos nodos.");
    }
}