/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Escribir un programa que pida dos números enteros por teclado y 
 * calcule la suma de los dos. El programa deberá después 
 * mostrar el resultado de la suma.
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese un numero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        num2 = input.nextInt();
        
        System.out.println("La suma de los numeros ingresados es " + (num1 + num2) + ".");
    }
    
}
