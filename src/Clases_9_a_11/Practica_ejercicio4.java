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
public class Practica_ejercicio4 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz 
     * A se denota por B y se obtiene cambiando sus filas por columnas 
     * (o viceversa).
     */
    public static void main(String[] args) {
        int [] [] matrizA = new int [4] [4];
        for (int i=0; i<4;i++){
            for (int j=0;j<4;j++){
            matrizA [i] [j] = (int)(Math.random()*10);
                System.out.print(matrizA [i] [j]);
            }
            System.out.println("");
        }
        System.out.println("");
        int [] [] matrizB = new int [4] [4];
        for (int k=0; k<4; k++){
            for (int j=0;j<4;j++){
            matrizB [k] [j] = matrizA [j] [k];
                System.out.print(matrizB [k] [j]);
            }
            System.out.println("");
        }
        }
    }
    

