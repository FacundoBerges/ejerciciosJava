/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Recorrer un vector de N enteros contabilizando cuántos números 
 * son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cant, dig1, dig2, dig3, dig4, dig5;
        int[] vectorEnteros;
        
        dig1 = 0;
        dig2 = 0;
        dig3 = 0;
        dig4 = 0;
        dig5 = 0;
        
        System.out.print("Ingrese cantidad de elementos del vector: ");
        cant = input.nextInt();
        while(cant <= 0)
        {
            System.out.print("Numero invalido. Ingrese cantidad de elementos del vector (mayor a 0): ");
            cant = input.nextInt();
        }
        
        vectorEnteros = new int[cant];
        
        fillArray(vectorEnteros);
        printArray(vectorEnteros);
                
        for (int i = 0; i < cant; i++) 
        {
            switch(Integer.toString(vectorEnteros[i]).length())
            {
                case 1:
                    dig1++;
                    break;
                case 2:
                    dig2++;
                    break;
                case 3:
                    dig3++;
                    break;
                case 4:
                    dig4++;
                    break;
                case 5:
                    dig5++;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("Se encontraron " + dig1 + " numeros de 1 digito, " + dig2 + " de 2 digitos, " + dig3 + " de 3 digitos, " + dig4 + " de 4 digitos y " + dig5 + " de 5 digitos.");
    }
    
    public static void fillArray(int[] arrayInt)
    {
        int len = arrayInt.length;
        Random random = new Random();
        
        for (int i = 0; i < len; i++) 
        {
            arrayInt[i] = random.nextInt(0, 100000);
        }
    }
    
    public static void printArray(int[] arrayInt)
    {
        int len = arrayInt.length;
        
        System.out.print("Vector: ");
        for (int i = 0; i < len; i++) 
        {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("");
    }
    
}
