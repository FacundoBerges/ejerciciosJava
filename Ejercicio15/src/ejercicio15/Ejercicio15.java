/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Facundo
 * 
 * Realizar un algoritmo que rellene un vector con los 100 primeros 
 * números enteros y los muestre por pantalla en orden descendente.
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayInt = new int[100];
        
        rellenarYMostrarVector(arrayInt);
        
        System.out.println("");
    }
    
    
    public static void rellenarYMostrarVector(int[] vector)
    {
        for (int i = 0; i < 100; i++) 
        {
            vector[i] = i+1;
        }
        
        System.out.print("Vector = ");
        for (int i = 99; i >= 0; i--) 
        {
            System.out.print(vector[i] + " ");
        }
    }
}
