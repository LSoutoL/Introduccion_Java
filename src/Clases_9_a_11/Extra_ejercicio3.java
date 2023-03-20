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
public class Extra_ejercicio3 {

    /**
     * @param args the command line arguments
     * Crear una función rellene un vector con números aleatorios, pasándole un
     * arreglo por parámetro. Después haremos otra función o procedimiento que 
     * imprima el vector.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la dimension del vector");
        int dim=leer.nextInt();
        int [] vector = new int [dim];
        rellenado (vector);
        impresion (vector);
    }
    public static int [] rellenado (int [] vector){
    for (int i=0; i<vector.length;i++){
        vector [i] = (int) (Math.random()*101);
    }
    return vector;        
    }
    public static void impresion (int [] vector){
    for (int i=0;i<vector.length;i++){
        System.out.print(vector [i] + " ");
    } 
        System.out.println("");
    }
    
}
