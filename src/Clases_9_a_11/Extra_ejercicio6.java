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
public class Extra_ejercicio6 {

    /**
     * @param args the command line arguments
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres
     * y, a medida que el usuario las va ingresando, construya una “sopa de 
     * letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se 
     * ubicarán todas en orden horizontal en una fila que será seleccionada de 
     * manera aleatoria. Una vez concluida la ubicación de las palabras, rellene 
     * los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente 
     * imprima por pantalla la sopa de letras creada.
     * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
     * siguientes funciones de Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String [] [] matriz = new String [20] [20];
        String palabra;
        int fila;
        int [] vector = new int [5];
        int i, j;
        for (i=0; i<20; i++){
            for (j=0; j<20;j++){
            matriz [i] [j] = "*";    
        }
        }
        for ( i =0; i<5;i++){
            System.out.println("Ingrese una palabra para la posicion " + (i+1));
            palabra=leer.next();
            while (palabra.length()<3 || palabra.length()>5){
            System.out.println("Ingrese una palabra para la posicion " + (i+1));
            palabra=leer.next();
            } 
            fila = (int) (Math.random()*20);
            System.out.println(fila);
            vector [i]=fila;
            while (i>0 && fila==vector[i-1]){
            fila = (int) (Math.random()*20);
            }
            for ( j=0; j<palabra.length();j++){
                matriz [fila] [j] = palabra.substring(j, j+1);
                }
            }
        for (i=0; i<20; i++){
            for (j=0; j<20;j++){
            if (matriz [i] [j].equals("*")) {
                matriz [i] [j] = String.valueOf((int)(Math.random()*10));
            }    
        }
        }
        for (i=0;i<20;i++){
            for (j=0;j<20;j++){
                System.out.print(matriz [i] [j] + " ");
            }
            System.out.println("");
        }
        }
        
        
        
    }
    

