/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Realizar un programa que solo permita introducir solo frases 
 * o palabras de 8 de largo. Si el usuario ingresa una frase o 
 * palabra de 8 de largo se deberá de imprimir un mensaje por 
 * pantalla que diga “CORRECTO”, en caso contrario, 
 * se deberá imprimir “INCORRECTO”.
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase;
        
        System.out.println("Ingrese una palabra o frase de 8 caracteres: ");
        phrase = input.nextLine();
        
        if(phrase.length() == 8)
        {
            System.out.println("CORRECTO");
        }
        else
        {
            System.out.println("INCORRECTO...");
        }
    }
    
}
