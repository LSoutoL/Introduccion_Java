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
public class Guia_ejercicios13_y_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String [] Equipo = new String [5];
        
        for (int i=0;i<Equipo.length;i++){
            System.out.println("Ingrese el nombre de su companero");
            Equipo[i]= leer.next();
        }
        for (String Equipo1 : Equipo) {
            System.out.println(Equipo1);
        }
}
}
