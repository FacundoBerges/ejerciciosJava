/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
 * Crear un programa que permita introducir un cuadrado por teclado y 
 * determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, 
 * es decir, están entre el 1 y el 9.
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizEnteros = new int[3][3];
        
        rellenarMatriz(matrizEnteros);
        
        System.out.println("");
        mostrarMatriz(matrizEnteros);
        
        if(esMagica(matrizEnteros))
        {
            System.out.println("La matriz ingresada es una matriz magica!");
        }
        else
        {
            System.out.println("La matriz ingresada NO es una matriz magica...");
        }
    }
    
    
    // funciones
    
    public static void inicializarVector(int[] arrayInt)
    {
        int len = arrayInt.length;
        
        for (int i = 0; i < len; i++) 
        {
            arrayInt[i] = 0;
        }
    }
    
    
    public static void rellenarMatriz(int[][] matrizEnteros)
    {
        Scanner input = new Scanner(System.in);
        int f = matrizEnteros.length;
        int c = matrizEnteros[0].length;
        
        for (int i = 0; i < f; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print("Ingrese un numero (posicion " + i + "," + j + " de la matriz): ");
                matrizEnteros[i][j] = input.nextInt();
                while(matrizEnteros[i][j] < 1 || matrizEnteros[i][j] > 9)
                {
                    System.out.print("Error. Debe ingresar un numero entre 1 y 9. Ingrese un numero (posicion " + i + "," + j + " de la matriz): ");
                    matrizEnteros[i][j] = input.nextInt();
                }
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
    
    
    public static boolean esMagica(int[][] matrizEnteros)
    {
        int f = matrizEnteros.length;
        int c = matrizEnteros[0].length;
        int[] vectorAnalisis = new int[f+c+2];
        int k = 0;
        int arrayLen = vectorAnalisis.length;
        
        inicializarVector(vectorAnalisis);
        
        for (int i = 0; i < f; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                vectorAnalisis[k] += matrizEnteros[i][j]; // filas
                vectorAnalisis[k+3] += matrizEnteros[j][i]; // columnas
            }
            k++;
        }
        
        for (int i = 0; i < f; i++) 
        {
            vectorAnalisis[arrayLen-2] += matrizEnteros[i][i];
            vectorAnalisis[arrayLen-1] += matrizEnteros[i][2-i];
        }
        
        for (int i = 0; i < arrayLen-1; i++) 
        {
            if(vectorAnalisis[i] != vectorAnalisis[i+1])
            {
                return false;
            }
        }
        
        return true;
    }
    
}
