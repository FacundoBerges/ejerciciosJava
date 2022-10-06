/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Random;

/**
 *
 * @author Facundo
 * 
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
 * y muestre la traspuesta de la matriz. 
 * La matriz traspuesta de una matriz A se denota por B y se obtiene
 * cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizEnteros = new int[4][4];
        
        rellenarMatriz(matrizEnteros);
        mostrarMatriz(matrizEnteros);
        
        
        System.out.println("Matriz transpuesta: ");
        transponerMatriz(matrizEnteros);
        mostrarMatriz(matrizEnteros);
    }
    
    public static void rellenarMatriz(int[][] matrizEnteros)
    {
        int f = matrizEnteros.length;
        int c = matrizEnteros[0].length;
        Random random = new Random();
        
        for (int i = 0; i < f; i++) 
        {
            for (int j = 0; j < c; j++) {
                matrizEnteros[i][j] = random.nextInt(0, 10);
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matrizEnteros)
    {
        int f = matrizEnteros.length;
        int c = matrizEnteros[0].length;
        
        System.out.println("Matriz: ");
        for (int i = 0; i < f; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(matrizEnteros[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void transponerMatriz(int[][] matrizEnteros)
    {
        int f = matrizEnteros.length;
        int c = matrizEnteros[0].length;
        int aux;
        
        for (int i = 0; i < f; i++) 
        {
            for (int j = i; j < c; j++) 
            {
                aux = matrizEnteros[i][j];
                matrizEnteros[i][j] = matrizEnteros[j][i];
                matrizEnteros[j][i] = aux;
            }
        }
    }
}
