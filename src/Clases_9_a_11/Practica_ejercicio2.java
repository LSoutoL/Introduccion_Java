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
public class Practica_ejercicio2 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que llene un vector de tamaño N con valores 
     * aleatorios y le pida al usuario un número a buscar en el vector. 
     * El programa mostrará dónde se encuentra el numero y si se encuentra 
     * repetido
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamano del vector");
        int largo = leer.nextInt();
        int [] vector = new int [largo];
        
        for (int i =0; i< vector.length; i++) {
            vector [i] = (int) (Math.random()*101);
        }
        System.out.println("Indique el numero que desea encontrar en el vector");
        int num = leer.nextInt();
        
        int j =0;
      
        for (int i=0; i < vector.length; i++){
        if (vector [i]==num){
           j++;
            System.out.println("Se encontro el numero en el indice: " + i);
        }    
        }
        if (j>0){
            System.out.println("El numero se encuentra repetido " + j + " veces.");
        } else System.out.println("El numero no estaba en el vector.");
    }
    
}
