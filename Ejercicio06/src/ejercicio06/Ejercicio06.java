/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Ingrese un numero: ");
        num = input.nextInt();
        
        System.out.print("El numero ingresado es ");
        if(num % 2 == 0)
        {
            System.out.println("par.");
        }
        else
        {
            System.out.println("impar.");
        }
    }
    
}
