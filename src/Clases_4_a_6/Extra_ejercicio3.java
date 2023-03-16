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
public class Extra_ejercicio3 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
     * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
     * la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
        } else System.out.println("La letra ingresada no es una vocal.");
    }
    
}
