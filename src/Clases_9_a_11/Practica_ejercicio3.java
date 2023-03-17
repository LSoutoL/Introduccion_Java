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
public class Practica_ejercicio3 {

    /**
     * @param args the command line arguments
     * Recorrer un vector de N enteros contabilizando cuántos números son de
     * 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Indique la dimension del vector");
        int dimension = leer.nextInt();
        int [] vector = new int [dimension];
        int decena=0;
        int centena=0;
        int mil=0;
        int diezmil=0;
        int unidad=0;
        for (int i = 0; i < vector.length; i++){
            vector [i] = (int) (Math.random()*100001);
            if (vector [i]<10){
                unidad++;
            } else if ((vector [i]>10)&&(vector [i]<100)){
                decena++;
            } else if ((vector [i]>100)&&(vector [i]<1000)){
                centena++;
            } else if ((vector [i]>1000)&&(vector [i]<10000)){
                mil++;
            } else if ((vector [i]>10000)&&(vector [i]<100000)){
                diezmil++;
            }
            System.out.println(vector[i] + " ");
        }
        if (unidad>0){
            System.out.println("Hay " + unidad + " numeros de un digito.");
        }
        if (decena>0){
            System.out.println("Hay " + decena + " numeros de dos digitos.");
        }
        if (centena>0){
            System.out.println("Hay " + centena + " numeros de tres digitos.");
        }
        if (mil>0){
            System.out.println("Hay " + mil + " numeros de cuatro digitos.");
        }
        if (diezmil>0){
            System.out.println("Hay " + diezmil + " numeros de cinco digitos.");
        }    
        
    }
    
}
