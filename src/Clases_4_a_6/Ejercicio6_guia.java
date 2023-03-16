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
public class Ejercicio6_guia {

    /**
     * @param args the command line arguments
     */
    /* Implementar un programa que le pida dos números enteros al usuario y 
    * determine si ambos o alguno de ellos es mayor a 25.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un  numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25)
            System.out.println("Ambos numeros son mayores a 25");
        else if (num1>25)
            System.out.println("Solo el primer numero es mayor a 25");
        else if (num2>25)
            System.out.println("Solo el segundo numero es mayor a 25");
        else
            System.out.println("Ambos numeros son menores que 25");
                
        }
        }
