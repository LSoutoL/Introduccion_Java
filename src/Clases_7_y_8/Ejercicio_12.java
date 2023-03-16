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
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     * Crea un procedimiento EsMultiplo que reciba los dos números pasados por 
     * el usuario, validando que el primer número múltiplo del segundo e imprima 
     * si el primer número es múltiplo del segundo, sino informe que no lo son.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1,num2);
    }
    public static void EsMultiplo (int num1,int num2){
        if (num1%num2==0){
            System.out.println("Los numeros son multiplos");
    } else System.out.println("Los numeros no son multiplos");
    }
    
}
