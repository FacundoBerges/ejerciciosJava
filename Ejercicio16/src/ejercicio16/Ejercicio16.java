/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Facundo
 * 
 * Realizar un algoritmo que rellene un vector de tamaño N con valores 
 * aleatorios y le pida al usuario un numero a buscar en el vector. 
 * El programa mostrará donde se encuentra el numero y si se encuentra repetido.
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, cant, cont;
        int[] vectorEnteros;
        
        System.out.print("Ingrese cantidad de elementos del vector: ");
        cant = input.nextInt();
        while(cant <= 0)
        {
            System.out.print("Numero invalido. Ingrese cantidad de elementos del vector (mayor a 0): ");
            cant = input.nextInt();
        }
        
        vectorEnteros = new int[cant];
        
        fillArray(vectorEnteros);
        
        System.out.print("Ingrese numero a buscar en el vector: ");
        num = input.nextInt();
        
        printArray(vectorEnteros);
        
        cont = searchNumInArray(vectorEnteros, num);
        if(cont != 0)
        {
            System.out.println("El numero " + num + " se encontro " + cont + " veces en el vector.");
        }
        else
        {
            System.out.println("No se encontro el numero " + num + " en el vector.");
        }
    }
    
    public static void fillArray(int[] arrayInt)
    {
        int len = arrayInt.length;
        Random random = new Random();
        
        for (int i = 0; i < len; i++) 
        {
            arrayInt[i] = random.nextInt(101);
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
    
    public static int searchNumInArray(int[] arrayInt, int num)
    {
        int len = arrayInt.length;
        int k = 0;
        
        for (int i = 0; i < len; i++) 
        {
            if(arrayInt[i] == num)
            {
                System.out.println("Se encontro el numero en la posicion " + i + " del vector.");
                k++;
            }
        }
        
        return k;
    }
    
}
