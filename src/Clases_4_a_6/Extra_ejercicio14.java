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
public class Extra_ejercicio14 {

    /**
     * @param args the command line arguments
     * Se dispone de un conjunto de N familias, cada una de las cuales tiene 
     * una M cantidad de hijos. Escriba un programa que pida la cantidad de 
     * familias y para cada familia la cantidad de hijos para averiguar 
     * la media de edad de los hijos de todas las familias.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int suma=0;
        int hijos=0;
        int j;
        System.out.println("Indique la cantidad de familias");
        int familias = leer.nextInt();
        
        for (int i=1; i<=familias; i++){
            System.out.println("Indique la cantidad de hijos de a familia " + i);
            hijos = leer.nextInt();
            j=1;
            while (j<=hijos){
                System.out.println("Indique la edad del nino " + j);
                int edad = leer.nextInt();
                suma= suma+edad;
                j++;
            }
        }
        int promedio= suma/(familias*hijos);
        System.out.println("La edad promedio de los hijos de las familias es: " + promedio);
    }
    
}
