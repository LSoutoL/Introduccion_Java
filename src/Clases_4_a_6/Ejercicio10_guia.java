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
public class Ejercicio10_guia {

    /**
     * @param args the command line arguments
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
     * imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
     * Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int j;
        for (int i=0; i<4; i++){
            int num = (int) (Math.random() * 10);
            System.out.print(num);
            j=1;
            while (j<=num){
                System.out.print("*");
                j++;
        }   
            System.out.println("");
        }
    }
    
}
