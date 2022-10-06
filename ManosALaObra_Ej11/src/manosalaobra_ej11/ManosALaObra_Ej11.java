/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobra_ej11;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ManosALaObra_Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase, codifiedPhrase;
        
        System.out.print("Ingrese una secuencia de caracteres (que finalice con .): ");
        phrase = input.nextLine();
        
        codifiedPhrase = codifyPhrase(phrase);
        
        System.out.println("Frase original: " + phrase);
        System.out.println("Frase codificada: " + codifiedPhrase);
        
    }
    
    public static String codifyPhrase(String phrase)
    {
        String codified = "";
        StringBuilder sb = new StringBuilder();
        char character;

        for (int i = 0; i < phrase.length(); i++) 
        {
            character = phrase.charAt(i);
            
            switch (character) 
            {
                case 'a':
                case 'A':
                    character = '@';
                    break;
                case 'e':
                case 'E':
                    character = '#';
                    break;
                case 'i':
                case 'I':
                    character = '$';
                    break;
                case 'o':
                case 'O':
                    character = '%';
                    break;
                case 'u':
                case 'U':
                    character = '*';
                    break;
                default:
                    break;
            }
            
            sb.append(character);
        }
        codified = sb.toString();

        return codified;
    }
    
}
