/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * 
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
 * este tipo de dispositivo lee cadenas enviadas por el usuario. 
 * Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo 
 * de 5 caracteres de largo, el primer carácter tiene que ser X y el último 
 * tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, 
 * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
 * y toda secuencia distinta de FDE, que no respete el formato se considera 
 * incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de 
 * lecturas correctas e incorrectas recibidas. 
 * Para resolver el ejercicio deberá investigar cómo se utilizan las
 * siguientes funciones de Java: Substring(), Length(), equals().
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase;
        int kCorrect, kIncorrect;
        
        kCorrect = 0;
        kIncorrect = 0;
        
        do
        {
            System.out.print("Ingrese una cadena que comience con X y termine con O: ");
            phrase = input.nextLine();
            
            if(phrase.length() <= 5 && (phrase.charAt(0) == 'X' || phrase.charAt(0) == 'x')&& (phrase.charAt(phrase.length() - 1) == 'O' || phrase.charAt(phrase.length() - 1) == 'o'))
            {
                System.out.println("Cadena ingresada correctamente!");
                kCorrect++;
            }
            else if (!phrase.equals("&&&&&"))
            {
                System.out.println("Cadena ingresada erronea...");
                kIncorrect++;
            }
            
        } while (!phrase.equals("&&&&&"));
        
        System.out.println("");
        System.out.println("Se ingresaron " + kCorrect + " cadenas correctas y " + kIncorrect + " cadenas incorrectas.");
        System.out.println("");
    }
    
}
