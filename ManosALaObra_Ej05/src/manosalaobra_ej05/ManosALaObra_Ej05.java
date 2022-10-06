/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobra_ej05;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ManosALaObra_Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean bool;
        double number;
        char character;
        
        System.out.println("Ingrese un valor booleano: ");
        bool = input.nextBoolean();
        
        System.out.println("Ingrese un valor numerico: ");
        number = input.nextDouble();
        
        System.out.println("Ingrese un caracter: ");
        character = input.next().charAt(0);
        
        System.out.println("");
        System.out.println(bool);
        System.out.println(number);
        System.out.println(character);
    }
    
}
