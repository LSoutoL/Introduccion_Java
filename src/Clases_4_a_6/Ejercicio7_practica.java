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
public class Ejercicio7_practica {

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
     * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
     * deben llegar con un formato fijo: tienen que ser de un máximo de 5 
     * caracteres de largo, el primer carácter tiene que ser X y el último tiene
     * que ser una O.
     *Las secuencias leídas que respeten el formato se consideran correctas, la 
     * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
     * y toda secuencia distinta de FDE, que no respete el formato se considera 
     * incorrecta.
     * Al finalizar el proceso, se imprime un informe indicando la cantidad de 
     * lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
     * deberá investigar cómo se utilizan las siguientes funciones de Java 
     * Substring(), Length(), equals().
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int suma_correctas = 0;
       int suma_incorrectas = 0;
       String ingreso = "";
       while (!"&&&&&".equals(ingreso)){
           System.out.println("Ingrese una cadena");
           ingreso=leer.next();
           if (ingreso.equals("&&&&&")){
               break;
           }
           int longitud = ingreso.length();
           String X = ingreso.substring(0, 1);
           String O = ingreso.substring(longitud-1, longitud);
           if (O.equals("O") && longitud<=5 && X.equals("X")) {
            suma_correctas++;   
           } else suma_incorrectas++;
           
       }
        System.out.println("Respuestas correctas: " + suma_correctas);
        System.out.println("Respuestas incorrectas: " + suma_incorrectas);
}
}
