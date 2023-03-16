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
public class Extra_ejercicio13 {

    /**
     * @param args the command line arguments
     * Crear un programa que dibuje una escalera de números, donde cada línea de
     * números comience en uno y termine en el número de la línea. Solicitar la 
     * altura de la escalera al usuario al comenzar. 
     * Ejemplo: si se ingresa el número 3:
     * 1
     * 12
     * 123
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Indique la altura de la escalera numerica");
        int num = leer.nextInt();
        String cadena;
        String resultado= "";
        
        for (int i=1; i<=num; i++){
            cadena = String.valueOf(i);
            resultado = resultado.concat(cadena);
            System.out.println(resultado);
        }
    }
    
}
