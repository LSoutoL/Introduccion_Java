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
public class Practica_ejercicio1 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        double resultado;
        
        System.out.println("Indique la operacion que desea realizar");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1: resultado = suma(num1, num2);
            System.out.println(resultado);
            break;
            case 2: resultado= resta(num1,num2);
            System.out.println(resultado);
            break;
            case 3: resultado= multi(num1,num2);
            System.out.println(resultado);
            break;
            case 4: resultado= divi(num1,num2);
            System.out.println(resultado);
            break;
        }
    }
    public static double suma(int num1,int num2){
               int resultado=num1+num2;
            return resultado;
    }
    public static double resta(int num1,int num2){
               int resultado=num1-num2;
            return resultado;
    }
    public static double multi(int num1,int num2){
        int resultado=num1*num2;
        return resultado;
    }
    public static double divi(int num1,int num2){
        int resultado=num1/num2;
        return resultado;
    }
}
