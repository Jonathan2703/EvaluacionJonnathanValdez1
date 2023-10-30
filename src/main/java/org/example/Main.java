package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int fila, columna, numero;

        Scanner scanner = new Scanner(System.in);

        // Solicitar la fila al usuario y validarla
        do {
            System.out.println("Ingrese la fila de la matriz (0-4):");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido para la fila.");
                scanner.next();
            }
            fila = scanner.nextInt();
            if (fila < 0 || fila > 4) {
                System.out.println("Fila fuera de rango, por favor ingrese un valor entre 0 y 4.");
            }
        } while (fila < 0 || fila > 4);

        // Solicitar la columna al usuario y validarla
        do {
            System.out.println("Ingrese la columna de la matriz (0-4):");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido para la columna.");
                scanner.next();
            }
            columna = scanner.nextInt();
            if (columna < 0 || columna > 4) {
                System.out.println("Columna fuera de rango, por favor ingrese un valor entre 0 y 4.");
            }
        } while (columna < 0 || columna > 4);

        // Solicitar el número al usuario y validar que sea un número entero y mayor que 0
        do {
            System.out.println("Ingrese un número entero mayor que 0:");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next();
            }
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("El número debe ser mayor que 0.");
            }
        } while (numero <= 0);

        // Mostrar el valor y la posición ingresados por el usuario
        System.out.println("Usted ha elegido el número " + numero + " en la posición (" + fila + ", " + columna + ").");

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
        System.out.println("Matriz resultante:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}