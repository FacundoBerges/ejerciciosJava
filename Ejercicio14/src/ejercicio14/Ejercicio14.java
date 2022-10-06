/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Crea una aplicación que a través de una función nos convierta 
 * una cantidad de euros introducida por teclado a otra moneda, 
 * estas pueden ser a dólares, yenes o libras. La función tendrá 
 * como parámetros, la cantidad de euros y la moneda a converir que será
 * una cadena, este no devolverá ningún valor y mostrará un mensaje 
 * indicando el cambio (void).
 * El cambio de divisas es:
 * * 0.86 libras es un 1 €
 * * 1.28611 $ es un 1 €
 * * 129.852 yenes es un 1 €
 * 
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double euros;
        String currency;
        
        System.out.print("Ingrese cantidad de euros: ");
        euros = input.nextDouble();
        
        while(euros <= 0)
        {
            System.out.print("Error, cantidad ingresada invalida (debe ser un numero positivo). Ingrese cantidad de euros: ");
            euros = input.nextDouble();
        }
        
        input.nextLine();
        System.out.print("Ingrese moneda a cotizar (dolares / yenes / libras): ");
        currency = input.nextLine().toLowerCase();
        
        while(!currency.equals("dolares") && !currency.equals("yenes") && !currency.equals("libras"))
        {
            System.out.print("Error. Dato ingresado invalido... Ingrese moneda a cotizar (dolares / yenes / libras): ");
            currency = input.nextLine().toLowerCase();
        }
        
        convertEur(euros, currency);
    }
    
    public static void convertEur(double qtyEur, String currency)
    {
        double price;
        
        if(currency.equals("dolares"))
        {
            price = qtyEur * 1.28611;
        }
        else if(currency.equals("yenes"))
        {
            price = qtyEur * 129852;
        }
        else
        {
            price = qtyEur * 0.86;
        }
        
        System.out.println("La cantidad de " + qtyEur + " euros equivale a " + price + " " + currency);
    }
    
}
