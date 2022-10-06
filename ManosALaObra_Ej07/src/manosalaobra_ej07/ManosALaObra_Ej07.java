/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobra_ej07;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ManosALaObra_Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int motorType; 
        
        System.out.print("Ingrese tipo de motor (1 - 4): ");
        motorType = input.nextInt();
        
        switch(motorType)
        {
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor valido para tipo de bomba.");
                break;
        }
    }
    
}
