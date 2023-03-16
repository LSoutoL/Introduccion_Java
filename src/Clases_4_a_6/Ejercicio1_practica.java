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
public class Ejercicio1_practica {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10);
        System.out.println(num);
        if (num % 2 == 0) {
            System.out.println("El numero es par"); 
        } else System.out.println("El numero es impar");

    }
    
}
