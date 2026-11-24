/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author crist
 */


import java.util.Scanner;

public class actividad1 {

    public static String[] lugares = {
        "Entrada", "Biblioteca", "Cafeteria",
        "Laboratorio", "Aulas"
    };

    public static int buscarLugar(String nombre, int indice) {

        // Caso base: no quedan ubicaciones por revisar
        if (indice >= lugares.length) {
            return -1;
        }

        // Caso base: se encuentra la ubicacion
        if (lugares[indice].equalsIgnoreCase(nombre)) {
            return indice;
        }

        // Caso recursivo: revisa la siguiente ubicacion
        return buscarLugar(nombre, indice + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿A donde se dirige? (Entrada, Biblioteca, Cafeteria, Laboratorio, Aulas): ");
        String buscado = scanner.nextLine().trim();

        int nodo = buscarLugar(buscado, 0);

        if (nodo != -1) {
            System.out.println("Destino valido -> " 
                    + lugares[nodo] + " (Nodo " + nodo + ")");
        } else {
            System.out.println("Error: '" + buscado 
                    + "' no pertenece al campus.");
        }

        scanner.close();
    }
}
