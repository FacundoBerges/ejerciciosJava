/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
 * y a continuación solicite números al usuario hasta que la suma 
 * de los números introducidos supere el límite inicial.
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit, num, total;
        
        total = 0;

        do
        {
            System.out.print("Ingrese numero limite (positivo mayor a 0): ");
            limit = input.nextInt();
        } while (limit < 1);
        
        while(total < limit)
        {
            System.out.print("Ingrese un numero: ");
            num = input.nextInt();
            total += num;
        }
        
        System.out.println("La suma de los numeros ingresados alcanzaron el numero limite (" + limit + ").");        
    }
    
}
