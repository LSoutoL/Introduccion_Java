/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_4_a_6;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Extra_ejercicio11 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int digito = 0;
         do {
            num=num/10;
            digito++;
         } while (num%10 != 0);
        System.out.println("El numero posee " + digito + " digitos.");
             
    }
    
}
