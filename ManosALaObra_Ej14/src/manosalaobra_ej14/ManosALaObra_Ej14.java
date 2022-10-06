/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobra_ej14;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ManosALaObra_Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] equipo = new String[7];
        
        for (int i = 0; i < 7; i++) 
        {
            System.out.print("Ingrese nombre del alumno " + (i+1) + ": ");
            equipo[i] = input.next();
        }
        
        System.out.println("");
        
        for (int i = 0; i < 7; i++) 
        {
            System.out.println(equipo[i]);
        }
    }
    
}
