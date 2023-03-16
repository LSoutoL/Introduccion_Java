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
public class Extra_ejercicio8 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. Si el número es múltiplo de
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, la 
     * cantidad de números pares y la cantidad de números impares. Al igual que 
     * en el ejercicio anterior los números negativos no deben sumarse. 
     * Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int num;
    int cantidad= 0;
    int pares=0;
    int impares=0;
     do {
         System.out.println("Ingrese un numero");
         num=leer.nextInt();
         if (num>=0){
           if (num%2==0){
           pares++;    
           }  else impares++;
         }
         cantidad++;
     } while (num%5 != 0);
        System.out.println("Se han leido " + cantidad + " numeros.");
        System.out.println("Se han leido " + pares + " numeros pares.");
        System.out.println("Se han leido " + impares + " numeros impares.");
    }
    
}
