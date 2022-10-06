/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobra_ej10;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ManosALaObra_Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4;
        
        do
        {        
            System.out.print("Ingrese un numero entre 1 y 20: ");
            num1 = input.nextInt();
        } while (num1 > 20 || num1 < 1);
        
        do
        {        
            System.out.print("Ingrese un numero entre 1 y 20: ");
            num2 = input.nextInt();
        } while (num2 > 20 || num2 < 1);
        
        do
        {        
            System.out.print("Ingrese un numero entre 1 y 20: ");
            num3 = input.nextInt();
        } while (num3 > 20 || num3 < 1);
        
        do
        {        
            System.out.print("Ingrese un numero entre 1 y 20: ");
            num4 = input.nextInt();
        } while (num4 > 20 || num4 < 1);
        
        
        System.out.println("");
        
        
        System.out.print(num1 + " ");
        for (int i = 0; i < num1; i++) 
        {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num2 + " ");
        for (int i = 0; i < num2; i++) 
        {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num3 + " ");
        for (int i = 0; i < num3; i++) 
        {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(num4 + " ");
        for (int i = 0; i < num4; i++) 
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
