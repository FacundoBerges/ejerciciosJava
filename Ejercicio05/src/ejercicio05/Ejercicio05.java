/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Escribir un programa que lea un número entero por teclado 
 * y muestre por pantalla el doble, el triple 
 * y la raíz cuadrada de ese número.
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Ingrese un numero entero: ");
        num = input.nextInt();
        
        System.out.println("Numero ingresado: " + num);
        System.out.println("El doble del numero ingresado es " + num * 2 + ".");
        System.out.println("El triple del numero ingresado es " + num * 3 + ".");
        System.out.println("La raiz cuadrada del numero ingresado es " + Math.sqrt(num) + ".");
    }
    
}
