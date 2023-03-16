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
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        for (int i=0; i<4; i++){
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            while ((num<1) || (num>20)){
                System.out.println("Incorrecto. Ingrese un numero entre 1 y 20");
                num=leer.nextInt();
            }
            if (i==0){
                num1=num;
            }
            if (i==1){
                num2=num;
            }
           if (i==2){
                num3=num;
            }
           if (i==3){
                num4=num;
            }
        }
        for (int i=0; i<4; i++){
            j=1;
            if (i==0){
                System.out.print(num1 + " ");
                while (j<=num1){
                System.out.print("*");
                j++;
                }
                System.out.println("");
            }
            if (i==1){
            System.out.print(num2 + " ");
            while (j<=num2){
                System.out.print("*");
                j++;
            } System.out.println("");
            }
           if (i==2){
               System.out.println(num3 + " ");
                while (j<=num3){
                System.out.print("*");
                j++;
                } System.out.println("");
            }
           if (i==3){
               System.out.println(num4 + " ");
                while (j<=num4){
                System.out.print("*");
                j++;
                } System.out.println("");
            }
        }   
            
    }
}
