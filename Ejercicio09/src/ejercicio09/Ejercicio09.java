/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Escriba un programa que pida una frase o palabra y valide si 
 * la primera letra de esa frase es una ‘A’. 
 * Si la primera letra es una ‘A’, se deberá de imprimir 
 * un mensaje por pantalla que diga “CORRECTO”, 
 * en caso contrario, se deberá imprimir “INCORRECTO”.
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase;
        
        System.out.print("Ingrese una palabra o frase que comience con 'a': ");
        phrase = input.nextLine();
        
        if (phrase.charAt(0) == 'a' || phrase.charAt(0) == 'A') 
        {
            System.out.println("CORRECTO!");
        }
        else
        {
            System.out.println("INCORRECTO...");
        }
    }
    
}
