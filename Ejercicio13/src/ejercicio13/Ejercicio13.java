/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado 
 * se deberá dibujar lo siguiente:
 * 
 *  * * * *
 *  *     *
 *  *     *
 *  * * * *
 * 
 * 
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese cantidad de filas/columnas del cuadrado: ");
        n = input.nextInt();
        
        while (n < 1)
        {
            System.out.print("Error. Debe ingresar un numero positivo. Ingrese cantidad de filas/columnas del cuadrado: ");
            n = input.nextInt();
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(i == 0 || i == n-1 || j == 0 || j == n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
