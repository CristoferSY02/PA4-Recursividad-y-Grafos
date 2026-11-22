
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

    public static void main(String[] args){
        System.out.println("Recorrido DFS:");
        dfs(0, new boolean[lugares.length]);
        System.out.println("--------------");
        System.out.println("Recorrido BFS:");
        bfs(0);
    }
}
