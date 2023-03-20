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
public class Extra_ejercicio4 {

    /**
     * @param args the command line arguments
     * Los profesores del curso de programación de Egg necesitan llevar un 
     * registro de las notas adquiridas por sus 10 alumnos para luego obtener 
     * una cantidad de aprobados y desaprobados. Durante el período de cursado 
     * cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 
     * por parciales. Las ponderaciones de cada nota son:
     * Primer trabajo práctico evaluativo 10%
     * Segundo trabajo práctico evaluativo 15%
     * Primer Integrador 25%
     * Segundo integrador 50%
     * Una vez cargadas las notas, se calcula el promedio y se guarda en el 
     * arreglo. Al final del programa los profesores necesitan obtener por 
     * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que 
     * solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas 
     * del curso.
     */
    public static void main(String[] args) {
     double [] vector = new double [10];
     Scanner leer = new Scanner (System.in);
     int aprobados=0;
     int desaprobados=0;
     for (int i=0; i<vector.length;i++){
         System.out.println("Indique las notas del alumno " + (i+1) + ":");
         System.out.println("Primer trabajo practico");
         double tp1 = (leer.nextInt()*0.10);
         System.out.println("Segundo trabajo practico");
         double tp2 = (leer.nextInt()*0.15);
         System.out.println("Primer integrador");
         double int1 = (leer.nextInt()*0.25);
         System.out.println("Segundo integrador");
         double int2 = (leer.nextInt()*0.50);
         vector [i]= tp1+tp2+int1+int2;
         if (vector[i]>=7){
            aprobados++; 
         } else if (vector [i]<7) {
             desaprobados++;
         }
     }
        System.out.println("En el curso hubo " + desaprobados + " desaprobados.");
        System.out.println("En el curso hubo " + aprobados + " aprobados.");
    }
    
}
