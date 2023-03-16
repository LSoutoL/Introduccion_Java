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
public class Extra_ejercicio1 {

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
     * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
     * calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una cantidad de minutos");
        int minutos = leer.nextInt();
        int horas, dias;
        horas = (minutos - minutos%60)/60;
        if (horas%24 == 0){
            dias=horas/24;
            horas=0;
        } else dias=(horas-horas%24)/24;
               horas=horas%24;
        if (dias==0){
           if (horas==1){
                System.out.println(minutos + " minutos equivalen a una hora.");
        } else System.out.println(minutos + " minutos equivalen a " + horas + " horas.");
        } else if (dias==1) {
            if (horas==0){
                System.out.println(minutos + " minutos equivalen a " + dias + " dia.");
        } else if (horas==1) {
            System.out.println(minutos + " minutos equivalen a " + dias + " dia y " + horas + " hora.");
        } else System.out.println(minutos + " minutos equivalen a " + dias + " dia y " + horas + " horas.");
        } else            
        System.out.println(minutos + " minutos equivalen a " + dias + " dias y " + horas + " horas.");
    }
}
