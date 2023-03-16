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
public class Ejercicio9_guia {

    /**
     * @param args the command line arguments
     */
    /* Escriba un programa que lea 20 números. 
    Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje 
    "Se capturó el numero cero".  
    El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
    pero si el número es negativo no debe sumarse.
    */

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num,suma,intentos;
        intentos=0;
        suma=0;
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            intentos++;
            if (num>=0){
            suma +=num;
            }
            if (num==0){
                System.out.println("Se capturó el numero cero");
                break;
            }   
            
        } while (intentos < 20);
         System.out.println("La suma de los numeros ingresados es: " + suma);
        
        }
            
    }
