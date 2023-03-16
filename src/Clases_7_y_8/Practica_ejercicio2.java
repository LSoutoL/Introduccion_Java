/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_7_y_8;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Practica_ejercicio2 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e imprima 
     * los datos de las personas ingresadas por teclado e indique si son mayores 
     * o menores de edad. Después de cada persona, el programa debe preguntarle 
     * al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
     * ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        String opcion;
        String nombre = "";
        int edad = 0;
        do {
            int resultado = funcion (nombre, edad);
            switch (resultado){
                case 1:  System.out.println( "Es mayor de edad.");
                break;
                case 2: System.out.println( "Es menor de edad.");
                break;
            }         
            System.out.println("Desea seguir mostrando personas? S/N");
            opcion=leer.next();
        } while (!opcion.equals("n"));
    }
    public static int funcion (String nombre, int edad){
        Scanner leer = new Scanner(System.in);
        int resultado;
        
        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.next();
        
        System.out.println("Ingrese la edad de la persona");
        edad = leer.nextInt();
        
        System.out.println(nombre);
        System.out.println(edad);
              
        if (edad>=18){
         resultado=1;
        } else resultado=2;
        return resultado;
    }
    
}
