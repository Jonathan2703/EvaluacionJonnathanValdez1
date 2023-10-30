package org.example;
import java.util.Scanner;

public class Validaciones {
    public static int validarFila(Scanner scanner, int maxFila) {
        int fila;
        do {
            System.out.println("Ingrese la fila de la matriz (0-" + (maxFila - 1) + "):");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido para la fila.");
                scanner.next();
            }
            fila = scanner.nextInt();
            if (fila < 0 || fila >= maxFila) {
                System.out.println("Fila fuera de rango, por favor ingrese un valor entre 0 y " + (maxFila - 1) + ".");
            }
        } while (fila < 0 || fila >= maxFila);
        return fila;
    }

    public static int validarColumna(Scanner scanner, int maxColumna) {
        int columna;
        do {
            System.out.println("Ingrese la columna de la matriz (0-" + (maxColumna - 1) + "):");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido para la columna.");
                scanner.next();
            }
            columna = scanner.nextInt();
            if (columna < 0 || columna >= maxColumna) {
                System.out.println("Columna fuera de rango, por favor ingrese un valor entre 0 y " + (maxColumna - 1) + ".");
            }
        } while (columna < 0 || columna >= maxColumna);
        return columna;
    }

    public static int validarNumero(Scanner scanner, int maxNumero) {
        int numero;
        do {
            System.out.println("Ingrese un número entero mayor que 0 y que no sea demasiado grande:");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next();
            }
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("El número debe ser mayor que 0.");
            }
            if (numero > maxNumero) {
                System.out.println("El número es demasiado grande, por favor ingrese un número más pequeño.");
            }
        } while (numero <= 0 || numero > maxNumero);
        return numero;
    }
}
