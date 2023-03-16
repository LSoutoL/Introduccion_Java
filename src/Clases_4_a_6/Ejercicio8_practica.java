/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_4_a_6;

/**
 *
 * @author lucia
 */
public class Ejercicio8_practica {

    /**
     * @param args the command line arguments
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá 
     * dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
     */
    public static void main(String[] args) {
       int lado = (int) (Math.random() * 10);
       int j;
       for (int i=1;i<=lado;i++){
           j=1;
           if (i==1) {
           while (j<=lado){
                System.out.print("*");
                j++;
        }   
            System.out.println("");
       }
           if (i==lado){
           while (j<=lado){
                System.out.print("*");
                j++;
       }
            System.out.println("");
       }   
           if (i!=1 && i!=lado) {
               while (j<=lado){
                 if (j==1) {
               System.out.print("*");
           } else if (j==lado) {
                System.out.print("*");
           } else System.out.print(" ");
                j++;
       }
                System.out.println("");
    }
    }
    }
}
