/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package detecciondeerrores_ej03;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class DeteccionDeErrores_Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad:");
        int edad = leer.nextInt();
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        
        System.out.println("Nombre: " + nombre + ". Edad: " + edad);
    }
    
}
