/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Dada una cantidad de grados centigrados se debe mostrar su 
 * equivalente en grados Fahrenheit. 
 * La formula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double centigrados, fahrenheit;
        
        System.out.print("Ingrese cantidad de grados (en celsius): ");
        centigrados = input.nextDouble();
        
        fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println("La cantidad de grados " + centigrados + " C es equivalente a " + fahrenheit + " grados Fahrenheit.");
    }
    
}
