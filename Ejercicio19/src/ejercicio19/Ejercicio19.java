/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Realice un programa que compruebe si una matriz dada es anti simétrica. 
 * Se dice que una matriz A es anti simétrica cuando ésta es igual a 
 * su propia traspuesta, pero cambiada de signo. Es decir, A es 
 * anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
 * denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizEnteros = new int[3][3];
        int[][] matrizTranspuesta = new int[3][3];
        
        rellenarMatriz(matrizEnteros);
        transponerMatriz(matrizEnteros, matrizTranspuesta);
        
        mostrarMatriz(matrizEnteros);
        mostrarMatriz(matrizTranspuesta);
        
        if (esAntisimetrica(matrizEnteros, matrizTranspuesta)) 
        {
            System.out.println("La matriz ingresada es una matriz anti simetrica!!!");
        }
        else
        {
            System.out.println("La matriz ingresada NO es una matriz antisimetrica...");
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
    
    public static void transponerMatriz(int[][] matrizEnteros, int[][] matTranspuesta)
    {
        int f = matrizEnteros.length;
        int c = matrizEnteros[0].length;
        
        for (int i = 0; i < f; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                matTranspuesta[i][j] = matrizEnteros[j][i];
            }
        }
    }
    
    public static boolean esAntisimetrica(int[][] matrizEnteros, int[][] matTranspuesta)
    {
        int f = matrizEnteros.length;
        int c = matrizEnteros[0].length;
        
        for (int i = 0; i < f; i++) 
        {
            for (int j = i; j < c; j++) 
            {
                if(matrizEnteros[i][j] + matTranspuesta[i][j] != 0)
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    
}
