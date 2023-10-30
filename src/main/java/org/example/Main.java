package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxFila = 5; // Tamaño máximo de fila
        int maxColumna = 5; // Tamaño máximo de columna
        int maxNumero = 1000; // Número máximo a ingresar

        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz(maxFila, maxColumna);

        int fila = Validaciones.validarFila(scanner, maxFila);
        int columna = Validaciones.validarColumna(scanner, maxColumna);
        int numero = Validaciones.validarNumero(scanner, maxNumero);

        System.out.println("Usted ha elegido el número " + numero + " en la posición (" + fila + ", " + columna + ").");

        matriz.setValor(fila, columna, numero);
        matriz.generarSecuencia(fila, columna, numero);

        System.out.println("Matriz resultante:");
        matriz.imprimirMatriz();
    }
}