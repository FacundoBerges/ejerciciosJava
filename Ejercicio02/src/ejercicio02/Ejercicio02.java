/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Escribir un programa que pida tu nombre, 
 * lo guarde en una variable y lo muestre por pantalla.
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        
        System.out.print("Ingrese su nombre: ");
        name = input.nextLine();
        
        System.out.println("Su nombre es " + name + ".");

    }
    
}
