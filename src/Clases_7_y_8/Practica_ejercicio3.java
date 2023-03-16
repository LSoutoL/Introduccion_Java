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
public class Practica_ejercicio3 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que a través de una función nos convierta una 
     * cantidad de euros introducida por teclado a otra moneda, estas pueden ser 
     * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad 
     * de euros y la moneda a convertir que será una cadena, este no devolverá 
     * ningún valor y mostrará un mensaje indicando el cambio (void).
     * El cambio de divisas es:
     * 0.86 libras es un 1 €
     * 1.28611 $ es un 1 €
     * 129.852 yenes es un 1 €

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Igrese la cantidad de euros");
        int euros = leer.nextInt();
        System.out.println("Indique la moneda a la que desea hacer la conversion:");
        System.out.println("1. dolares");
        System.out.println("2. yenes");
        System.out.println("3. libras");
        int opcion = leer.nextInt();
        conversion (euros,opcion);
    }
    public static void conversion (int euros, int opcion){
        double valor;
        switch (opcion) {
            case 1: valor = euros*1.28611;
                System.out.println(valor);
            break;
            case 2: valor=euros*129.852;
            System.out.println(valor);
            break;
            case 3: valor=euros*0.86;
            System.out.println(valor);
            break;
        }
            
    }
    
}
