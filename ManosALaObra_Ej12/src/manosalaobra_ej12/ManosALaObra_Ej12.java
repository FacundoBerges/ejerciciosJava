/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobra_ej12;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ManosALaObra_Ej12 {

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
        
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int num1, int num2)
    {
        if(num1 % num2 == 0)
        {
            System.out.println("El numero " + num1 + " es multiplo de " + num2 + ".");
        }
        else
        {
            System.out.println("El numero " + num1 + " NO es multiplo del numero " + num2 + ".");
        }
    }
    
}
