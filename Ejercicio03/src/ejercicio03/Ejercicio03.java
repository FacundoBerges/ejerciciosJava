/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Escribir un programa que pida una frase y la muestre 
 * toda en mayúsculas y después toda en minúsculas.
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase;
        
        System.out.print("Ingrese una frase: ");
        phrase = input.nextLine();
        
        System.out.println("Frase en mayusculas: " + phrase.toUpperCase());
        System.out.println("Frase en minusculas: " + phrase.toLowerCase());
    }
    
}
