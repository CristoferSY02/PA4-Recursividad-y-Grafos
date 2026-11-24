public class actividad3 {

    public static String[] lugares = {"Entrada", "Biblioteca", "Cafeteria", "Laboratorio", "Aulas"};

    // 1 = hay camino entre los dos lugares, 0 = no hay camino
    public static int[][] caminos = {
        //  Ent Bib Caf Lab Aul
        {0, 1, 1, 0, 0},  // Entrada
        {1, 0, 0, 1, 0},  // Biblioteca
        {1, 0, 0, 0, 1},  // Cafeteria
        {0, 1, 0, 0, 1},  // Laboratorio
        {0, 0, 1, 1, 0}   // Aulas
    };

    // Costo real de cada tramo para A* (0 = sin conexion directa)
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

    public static void dfs(int actual, boolean[] visitado){
        if(visitado[actual]){
            return;
        }
        visitado[actual] = true;
        System.out.println(lugares[actual]);
        for(int i = 0; i < lugares.length; i++){
            if(caminos[actual][i] == 1){
                dfs(i, visitado);
            }
        }
    }

    public static void bfs(int inicio){
        boolean[] visitado = new boolean[lugares.length];
        int[] cola = new int[lugares.length];
        int front = 0, rear = 0;

        cola[rear++] = inicio;
        visitado[inicio] = true;

        while(front < rear){
            int actual = cola[front++];
            System.out.println(lugares[actual]);
            for(int i = 0; i < lugares.length; i++){
                if(caminos[actual][i] == 1 && !visitado[i]){
                    visitado[i] = true;
                    cola[rear++] = i;
                }
            }
        }
    }

    public static void aStar(int inicio, int meta){
        int n = lugares.length;
        int[] g = new int[n];
        int[] f = new int[n];
        int[] padre = new int[n];
        boolean[] cerrado = new boolean[n];

        for(int i = 0; i < n; i++){
            g[i] = Integer.MAX_VALUE;
            f[i] = Integer.MAX_VALUE;
            padre[i] = -1;
        }

        g[inicio] = 0;
        f[inicio] = heuristica[inicio];

        while(true){
            int actual = -1;
            int menorF = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++){
                if(!cerrado[i] && g[i] != Integer.MAX_VALUE && f[i] < menorF){
                    menorF = f[i];
                    actual = i;
                }
            }

            if(actual == -1){
                System.out.println("No se encontro ruta hacia " + lugares[meta]);
                return;
            }

            if(actual == meta){
                break;
            }

            cerrado[actual] = true;

            for(int vecino = 0; vecino < n; vecino++){
                if(costos[actual][vecino] > 0 && !cerrado[vecino]){
                    int nuevoG = g[actual] + costos[actual][vecino];
                    int nuevoF = nuevoG + heuristica[vecino];

                    if(nuevoG < g[vecino]){
                        padre[vecino] = actual;
                        g[vecino] = nuevoG;
                        f[vecino] = nuevoF;
                    }
                }
            }
        }

        String ruta = "";
        for(int curr = meta; curr != -1; curr = padre[curr]){
            ruta = lugares[curr] + (ruta.isEmpty() ? "" : " -> " + ruta);
        }

        System.out.println("Ruta elegida por A*: " + ruta);
        System.out.println("Costo total minimo (f): " + f[meta]);
    }

    public static void main(String[] args){
        System.out.println("Recorrido DFS:");
        dfs(0, new boolean[lugares.length]);
        System.out.println("--------------");
        System.out.println("Recorrido BFS:");
        bfs(0);
        System.out.println("--------------");
        System.out.println("Algoritmo A*:");
        aStar(0, 4);
    }
}

