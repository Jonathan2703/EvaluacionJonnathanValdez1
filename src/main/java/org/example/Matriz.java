package org.example;

public class Matriz {
    private int[][] matriz;
    private int maxFila;
    private int maxColumna;

    public Matriz(int maxFila, int maxColumna) { // Constructor
        this.maxFila = maxFila;
        this.maxColumna = maxColumna;
        this.matriz = new int[maxFila][maxColumna];
    }

    public void setValor(int fila, int columna, int valor) { // Setter
        if (fila >= 0 && fila < maxFila && columna >= 0 && columna < maxColumna) { // Validación de rango
            matriz[fila][columna] = valor;
        } else {
            System.out.println("Posición fuera de rango.");
        }
    }

    public int getValor(int fila, int columna) {
        if (fila >= 0 && fila < maxFila && columna >= 0 && columna < maxColumna) {
            return matriz[fila][columna];
        } else {
            System.out.println("Posición fuera de rango.");
            return -1; // Valor predeterminado para posiciones fuera de rango
        }
    }

    public void generarSecuencia(int fila, int columna, int valor) { // Genera la secuencia de números
        for (int i = 0; i < maxFila; i++) {
            if (i != fila) { // Si no es la fila seleccionada
                matriz[i][columna] = valor + Math.abs(fila - i); // Se calcula el valor de la celda
            }
        }
        for (int i = 0; i < maxColumna; i++) {
            if (i != columna) {
                matriz[fila][i] = valor + Math.abs(columna - i);
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < maxFila; i++) {
            for (int j = 0; j < maxColumna; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
