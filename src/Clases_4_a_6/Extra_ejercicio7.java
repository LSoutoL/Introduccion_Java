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
public class Extra_ejercicio7 {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, el valor 
     * mínimo y el promedio de n números (n>0). El valor de n se solicitará al 
     * principio del programa y los números serán introducidos por el usuario. R
     * ealice dos versiones del programa, una usando el bucle “while” y otra con 
     * el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Indique la cantidad de numeros que desea ingresar");
        int limite = leer.nextInt();
        int i =1;
        int max=0;
        int min=10000;
        int suma = 0;
        while (i<=limite){
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
        }
        double promedio = suma/limite;
        System.out.println("El numero maximo ingresado es: " + max);
        System.out.println("El numero minimo ingresado es: " + min);
        System.out.println("El promedio de los numeros ingresados es: "+promedio);
    }
    
}
