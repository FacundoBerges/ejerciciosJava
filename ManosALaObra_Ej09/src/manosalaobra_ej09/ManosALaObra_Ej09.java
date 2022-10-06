/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobra_ej09;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ManosALaObra_Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i, total;
        Scanner input = new Scanner(System.in);
        
        i = 0;
        total = 0;
        
        do
        {
            System.out.print("Ingrese un numero: ");
            num = input.nextInt();
            
            if(num == 0)
            {
                System.out.println("Se capturo el numero 0.");
                break;
            }
            else if (num > 0)
            {
                total += num;
            }
            
            i++;
        } while (i < 20);
        
        if(total != 0)
        {
            System.out.println("El total de los numeros positivos ingresados es " + total + ".");
        }
        else
        {
            System.out.println("No se ingresaron numeros positivos.");
        }
        
        
    }
    
}
