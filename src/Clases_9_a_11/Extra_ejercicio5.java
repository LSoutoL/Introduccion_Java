/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_9_a_11;

/**
 *
 * @author lucia
 */
public class Extra_ejercicio5 {

    /**
     * @param args the command line arguments
     * Realizar un programa que llene una matriz de tamaño NxM con valores 
     * aleatorios y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        int N = (int) (Math.random()*10);
        int M = (int) (Math.random()*10);
        int [] [] matriz = new int [N] [M];
        int suma=0;
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
            matriz [i] [j]= (int) (Math.random()*10);
            System.out.print(matriz [i] [j] + " ");
            suma+=matriz[i] [j];
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
    
}
