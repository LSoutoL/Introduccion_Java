/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_9_a_11;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Extra_ejercicio2Nico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Tamaño:");
        int n = leer.nextInt();
        int vec1[] = new int[n];
        int vec2[] = new int[n];
        boolean iguales = true;
        
        for (int i = 0; i < n; i++) {
            vec1[i] = (int) (Math.random()*10);
            vec2[i] = (int) (Math.random()*10);
            if (vec1[i] != vec2[i]) {
                iguales = false;
                break;
            }
        }
        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
}
