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
public class Extra_ejercicio2 {

    /**
     * @param args the command line arguments
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia 
     * entre los elementos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Indique la dimension de los vectores");
        int dim = leer.nextInt();
        int [] vector1= new int [dim];
        int [] vector2= new int [dim];
        int i;
        boolean comp =true;
        for (i=0;i<dim;i++){
            System.out.println("Ingrese el valor del indice [" +i+ "] del primer vector.");
            vector1 [i]=leer.nextInt();
        }
        for (i=0;i<dim;i++){
            System.out.println("Ingrese el valor del indice [" +i+ "] del segundo vector.");
            vector2 [i]=leer.nextInt();
        }
        for (i=0;i<dim;i++){
            if (vector1[i]!=vector2[i]){
            comp=false;
            break;
            }
        }
        if (comp==true){
            System.out.println("Los vectores son iguales.");
        } else System.out.println("Los vectores son distintos.");
    }
    
}
