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
public class Ejercicio8_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una nota entre 1 y 10");
        int nota = leer.nextInt();
        while (0>=nota || nota>=10) {
            System.out.println("Nota invalida. Intente una nota entre 1 y 10.");
            nota=leer.nextInt();
        }
    }
    
}
