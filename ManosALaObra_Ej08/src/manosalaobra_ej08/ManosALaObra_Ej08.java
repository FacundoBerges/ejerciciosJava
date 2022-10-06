/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobra_ej08;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ManosALaObra_Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flagValid = false;
        int num;
        Scanner input = new Scanner(System.in);
        
        while(!flagValid)
        {
            System.out.print("Ingrese un numero entre 0 y 10: ");
            num = input.nextInt();
            
            if(num >= 0 && num <= 10)
            {
                flagValid = true;
            }
        }
    }
    
}
