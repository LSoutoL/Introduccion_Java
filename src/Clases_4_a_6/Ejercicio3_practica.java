/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_4_a_6;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Ejercicio3_practica {

    /**
     * @param args the command line arguments
     * Realizar un programa que permita introducir solo frases o palabras 
     * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo 
     * se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en 
     * caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la 
     * funcion Lenght() en Java
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        if (frase.length()==8){
            System.out.println("Correcto! Tu frase tiene ocho carcateres.");
        } else System.out.println("Incorrecto.");
        
           
    }
    
}
