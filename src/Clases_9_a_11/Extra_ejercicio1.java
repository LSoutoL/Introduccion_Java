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
public class Extra_ejercicio1 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de todos los elementos de un 
     * vector de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Indique el tamano del vector");
        int dim = leer.nextInt();
        int [] vector = new int [dim];
        int i;
        int suma=0;
        for (i=0;i<dim;i++){
            System.out.println("Ingrese el numero que desea ingresar en el indice [" +i+ "].");
            vector[i]=leer.nextInt();
            suma+=vector[i];
        }
        System.out.println("La suma de los numeros del vector es: " +suma);
        
    }
    
}
