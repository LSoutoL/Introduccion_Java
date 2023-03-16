/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_proyecto;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num = leer.nextDouble();
        double doble = num * 2;
        double triple = num * 3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble de " + num + " es " + doble + ", su triple es " + triple + " y su raiz cuadrada es " + raiz + ".");
    }
    
}
