/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class actividad2 {
   

    public static void mergeSort(int[] datos, int inicio, int fin) {

        if (inicio < fin) {

            int medio = (inicio + fin) / 2;

            mergeSort(datos, inicio, medio);
            mergeSort(datos, medio + 1, fin);

            mezclar(datos, inicio, medio, fin);
        }
    }

    public static void mezclar(int[] datos, int inicio,
                               int medio, int fin) {

        int n1 = medio - inicio + 1;
        int n2 = fin - medio;

        int[] izquierda = new int[n1];
        int[] derecha = new int[n2];

        for (int i = 0; i < n1; i++) {
            izquierda[i] = datos[inicio + i];
        }

        for (int j = 0; j < n2; j++) {
            derecha[j] = datos[medio + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = inicio;

        while (i < n1 && j < n2) {

            if (izquierda[i] <= derecha[j]) {
                datos[k] = izquierda[i];
                i++;
            } else {
                datos[k] = derecha[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            datos[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < n2) {
            datos[k] = derecha[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] tiempos = {12, 5, 9, 3, 15, 7};

        System.out.println("Rutas antes de ordenar:");

        for (int tiempo : tiempos) {
            System.out.print(tiempo + " ");
        }

        mergeSort(tiempos, 0, tiempos.length - 1);

        System.out.println("\n\nRutas despues de ordenar:");

        for (int tiempo : tiempos) {
            System.out.print(tiempo + " ");
        }

        System.out.println("\nLas rutas estan ordenadas "
                + "desde la mas rapida hasta la mas lenta.");
    }
}

