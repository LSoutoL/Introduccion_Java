/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_7_y_8;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Practica_ejercicio4 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que nos pida un número por teclado y con una función
     * se lo pasamos por parámetro para que nos indique si es o no un número 
     * primo, debe devolver true si es primo, sino false.
     * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
     * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
     * 17 si es primo.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        boolean resultado = primo (num);
        if (resultado==true){
            System.out.println("Es un numero primo");
        } else System.out.println("No es un numero primo");
    
}
    public static boolean primo (int num) {
        boolean resultado=true;
        
        for (int i=2; i<num; i++) {
            if (num%i==0){
            resultado=false;
            break;
            }
        } 
        
        return resultado;
    }
}
