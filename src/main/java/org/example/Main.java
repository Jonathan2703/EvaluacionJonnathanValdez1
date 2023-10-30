package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int fila, columna, numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la posición de la matriz (fila y columna):");
        fila = scanner.nextInt();
        columna = scanner.nextInt();

        System.out.println("Ingrese un número entero:");
        numero = scanner.nextInt();

        // Llenar la matriz con el número dado
        matriz[fila][columna] = numero;

        // Generar valores secuenciales en las filas y columnas correspondientes al número ingresado
        for (int i = 0; i < 5; i++) {
            if (i != fila) {
                matriz[i][columna] = numero + Math.abs(fila - i);
            }
            if (i != columna) {
                matriz[fila][i] = numero + Math.abs(columna - i);
            }
        }

        // Imprimir la matriz resultante
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}