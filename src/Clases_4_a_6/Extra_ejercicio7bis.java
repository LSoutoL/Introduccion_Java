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
public class Extra_ejercicio7bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Indique la cantidad de numeros que desea ingresar");
        int limite = leer.nextInt();
        int i =1;
        int max=0;
        int min=10000;
        int suma = 0;
        do {
            System.out.println("Ingrese un numero");   
            int num = leer.nextInt();
            suma = suma + num;
            i++;
            if  (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            } 
        } while (i<=limite);
        double promedio = suma/limite;
        System.out.println("El numero maximo ingresado es: " + max);
        System.out.println("El numero minimo ingresado es: " + min);
        System.out.println("El promedio de los numeros ingresados es: "+promedio);
    }
    
}
