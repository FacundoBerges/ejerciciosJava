/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 
 * y la matriz P de 3x3, se solicita escribir un programa en el cual 
 * se compruebe si la matriz P está contenida dentro de la matriz M. 
 * Para ello se debe verificar si entre todas las submatrices de 3x3 que
 * se pueden formar en la matriz M, desplazándose por filas o columnas, 
 * existe al menos una que coincida con la matriz P. 
 * En ese caso, el programa debe indicar la fila y la columna de la matriz M 
 * en la cual empieza el primer elemento de la submatriz P.
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        int indiceI, indiceJ;
        int fM = matrizM.length;
        int cM = matrizM[0].length;
        
        indiceI = -1;
        indiceJ = -1;
        
        rellenarMatriz(matrizM);
        System.out.println("");
        rellenarMatriz(matrizP);
        
        System.out.println("");
        mostrarMatriz(matrizM);
        mostrarMatriz(matrizP);
        
        for (int i = 0; i < fM-3; i++) 
        {
            for (int j = 0; j < cM-3; j++) 
            {
                if( matrizM[i][j] == matrizP[0][0] &&
                    matrizM[i][j+1] == matrizP[0][1] &&
                    matrizM[i][j+2] == matrizP[0][2] &&
                    matrizM[i+1][j] == matrizP[1][0] &&
                    matrizM[i+1][j+1] == matrizP[1][1] &&
                    matrizM[i+1][j+2] == matrizP[1][2] &&
                    matrizM[i+2][j] == matrizP[2][0] &&
                    matrizM[i+2][j+1] == matrizP[2][1] &&
                    matrizM[i+2][j+2] == matrizP[2][2])
                {
                    indiceI = i;
                    indiceJ = j;
                }
            }
        }
        
        if(indiceI != -1)
        {
            System.out.println("La matriz P se encuentra incluida en la matriz M en los indices:");
            System.out.println(indiceI + "," + indiceJ + " - " + indiceI + "," + (indiceJ+1) + " - " + indiceI + "," + (indiceJ+2));
            System.out.println((indiceI+1) + "," + indiceJ + " - " + (indiceI+1) + "," + (indiceJ+1) + " - " + (indiceI+1) + "," + (indiceJ+2));
            System.out.println((indiceI+2) + "," + indiceJ + " - " + (indiceI+2) + "," + (indiceJ+1) + " - " + (indiceI+2) + "," + (indiceJ+2));
        }
        else
        {
            System.out.println("La matriz P no esta incluida en la matriz M.");
        }
        System.out.println("");
    }
    
    
    // Funciones
    
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
    
    public static int estaIncluida(int[][] matrizM, int[][] matrizP)
    {
        int rtn = -1;
        int fM = matrizM.length;
        int cM = matrizM[0].length;
        
        for (int i = 0; i < fM-3; i++) 
        {
            for (int j = 0; j < cM-3; j++) 
            {
                if( matrizM[i][j] == matrizP[0][0] &&
                    matrizM[i][j+1] == matrizP[0][1] &&
                    matrizM[i][j+2] == matrizP[0][2] &&
                    matrizM[i+1][j] == matrizP[1][0] &&
                    matrizM[i+1][j+1] == matrizP[1][1] &&
                    matrizM[i+1][j+2] == matrizP[1][2] &&
                    matrizM[i+2][j] == matrizP[2][0] &&
                    matrizM[i+2][j+1] == matrizP[2][1] &&
                    matrizM[i+2][j+2] == matrizP[2][2])
                {
                    rtn = i;
                }
            }
        }
        
        return rtn;
    }
    
}
