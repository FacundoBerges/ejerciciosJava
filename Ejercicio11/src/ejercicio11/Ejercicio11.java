/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Realizar un programa que pida dos números enteros 
 * positivos por teclado y muestre por pantalla el siguiente menú:
 * 
 * 
 * MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 * Elija opción:
 * 
 * 
 * El usuario deberá elegir una opción y el programa deberá 
 * mostrar el resultado por pantalla y luego volver al menú. 
 * El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5,
 * en vez de salir del programa directamente, se debe 
 * mostrar el siguiente mensaje de confirmación: 
 * ¿Está seguro que desea salir del programa (S/N)? 
 * Si el usuario selecciona el carácter ‘S’ se sale del
 * programa, caso contrario se vuelve a mostrar el menú.
 * 
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, option;
        char confirm = 'n';
        
        System.out.print("Ingrese un numero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        num2 = input.nextInt();
        
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("");
            System.out.println("");
            System.out.println("MENU");
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Numeros ingresados: A = " + num1 + ", B = " + num2);
            System.out.println("");
            System.out.print("Ingrese opcion: ");
            option = input.nextInt();
            
            System.out.println("");
            
            switch (option) {
                case 1:
                    System.out.println("SUMA:");
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("RESTA:");
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("MULTIPLICACION:");
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("DIVISION:");
                    if(num2 != 0)
                    {
                        System.out.println(num1 + " / " + num2 + " = " + ((num1 * 1.0) / num2));
                    }
                    else
                    {
                        System.out.println("No se puede dividir por 0.");
                    }
                    break;
                case 5:
                    System.out.print("¿Esta seguro que desea salir del programa (S/N)?: ");
                    confirm = input.next().charAt(0);
                    
                    while (confirm != 's' && confirm != 'S' && confirm != 'n' && confirm != 'N')
                    {
                        System.out.print("Error. Debe ingresar 'S' o 'N'... ¿Está seguro que desea salir del programa (S/N)?: ");
                        confirm = input.next().charAt(0);
                    }
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta...");
                    break;
            }
            
            System.out.println("");
            /*System.out.println("Presione una tecla para continuar.");
            input.next();
            */
        } while (confirm != 's' && confirm != 'S');
        
        System.out.println("Saliendo del programa...");
    }
    
}
