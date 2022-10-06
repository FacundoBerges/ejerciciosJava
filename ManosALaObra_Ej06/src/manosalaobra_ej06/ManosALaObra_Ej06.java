/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobra_ej06;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ManosALaObra_Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese un numero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        num2 = input.nextInt();
        
        if(num1 > 25 || num2 > 25)
        {
            System.out.println("Se ingreso al menos un numero mayor a 25.");
        }
        else
        {
            System.out.println("No se ingreso ningun numero mayor a 25.");
        }
    }
    
}
