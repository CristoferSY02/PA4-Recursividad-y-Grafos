/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ana
 */


public class actividad4 {

    public static String[] lugares = {"Entrada", "Biblioteca", "Cafeteria", "Laboratorio", "Aulas"};

    // Distancia en metros entre lugares, 0 = no hay camino
    public static int[][] caminos = {
        //  Ent  Bib  Caf  Lab  Aul
        {0,   100, 150, 0,   0},    // Entrada
        {100, 0,   0,   120, 0},    // Biblioteca
        {150, 0,   0,   0,   200},  // Cafeteria
        {0,   120, 0,   0,   80},   // Laboratorio
        {0,   0,   200, 80,  0}     // Aulas
    };

    // Distancia estimada en linea recta hasta Aulas (heuristica de A*)
    public static int[] h = {250, 180, 150, 80, 0};

    public static void dfs(int actual, boolean[] visitado){
        if(visitado[actual]){
            return;
        }
        visitado[actual] = true;
        System.out.print(lugares[actual] + " ");
        for(int i = 0; i < lugares.length; i++){
            if(caminos[actual][i] > 0){
                dfs(i, visitado);
            }
        }
    }

    // padre[x] guarda de que lugar venimos para llegar a x
    public static void imprimirRuta(int[] padre, int nodo){
        if(nodo == -1){
            return;
        }
        imprimirRuta(padre, padre[nodo]);
        System.out.print(lugares[nodo] + " ");
    }

    public static void bfs(int inicio, int meta){
        boolean[] visitado = new boolean[lugares.length];
        int[] padre = {-1, -1, -1, -1, -1};
        int[] cola = new int[lugares.length];
        int front = 0, rear = 0;

        cola[rear++] = inicio;
        visitado[inicio] = true;

        while(front < rear){
            int actual = cola[front++];
            if(actual == meta){
                break;
            }
            for(int i = 0; i < lugares.length; i++){
                if(caminos[actual][i] > 0 && !visitado[i]){
                    visitado[i] = true;
                    padre[i] = actual;
                    cola[rear++] = i;
                }
            }
        }

        if(!visitado[meta]){
            System.out.println("BFS: No existe una ruta.");
            return;
        }

        // suma la distancia de cada tramo, de la meta hacia atras
        int total = 0;
        for(int x = meta; padre[x] != -1; x = padre[x]){
            total += caminos[padre[x]][x];
        }
        System.out.print("BFS: ");
        imprimirRuta(padre, meta);
        System.out.println("-> " + total + " m");
    }

    public static void aEstrella(int inicio, int meta){
        // g = distancia real acumulada desde el inicio (999999 = aun no se llega)
        int[] g = {999999, 999999, 999999, 999999, 999999};
        int[] padre = {-1, -1, -1, -1, -1};
        boolean[] abierto = new boolean[lugares.length];  // pendientes por revisar
        boolean[] cerrado = new boolean[lugares.length];  // ya revisados

        g[inicio] = 0;
        abierto[inicio] = true;

        while(true){
            // elige el lugar abierto con menor f = g + h
            int actual = -1;
            for(int i = 0; i < lugares.length; i++){
                if(abierto[i] && (actual == -1 || g[i] + h[i] < g[actual] + h[actual])){
                    actual = i;
                }
            }
            if(actual == -1){
                System.out.println("A*: No existe una ruta.");
                return;
            }
            if(actual == meta){
                break;
            }
            abierto[actual] = false;
            cerrado[actual] = true;

            // revisa los vecinos y actualiza si encuentra un camino mas corto
            for(int i = 0; i < lugares.length; i++){
                if(caminos[actual][i] > 0 && !cerrado[i]){
                    int nuevoCosto = g[actual] + caminos[actual][i];
                    if(nuevoCosto < g[i]){
                        g[i] = nuevoCosto;
                        padre[i] = actual;
                        abierto[i] = true;
                    }
                }
            }
        }

        System.out.print("A*: ");
        imprimirRuta(padre, meta);
        System.out.println("-> " + g[meta] + " m");
    }

    public static void main(String[] args){
        System.out.print("DFS (recorrido): ");
        dfs(0, new boolean[lugares.length]);
        System.out.println();
        System.out.println("--------------");
        bfs(0, 4);
        aEstrella(0, 4);
        System.out.println("--------------");
        System.out.println("Recomendacion: A*, porque encuentra la ruta de menor distancia.");
    }
}