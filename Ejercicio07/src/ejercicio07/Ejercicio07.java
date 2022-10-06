/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Crear un programa que pida una frase y si esa frase es igual
 * a “eureka” el programa pondrá un mensaje de Correcto, 
 * sino mostrará un mensaje de Incorrecto.
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase;
        
        System.out.print("Ingrese una frase: ");
        phrase = input.nextLine();
        
        if (phrase.equals("eureka")) 
        {
            System.out.println("Correcto!");
        }
        else
        {
            System.out.println("Incorrecto...");
        }
    }
    
}
