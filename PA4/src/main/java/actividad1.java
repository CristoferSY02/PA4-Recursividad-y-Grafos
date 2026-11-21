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

    // Ejemplo recursivo: calcula el factorial de n
    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // Caso base
        }
        return n * factorial(n - 1); // Llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Resultado recursivo (" + n + "): " + factorial(n));
        }
        sc.close();
    }
}
