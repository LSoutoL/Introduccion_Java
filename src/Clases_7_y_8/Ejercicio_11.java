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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     * Escribir un programa que procese una secuencia de caracteres ingresada 
     * por teclado y terminada en punto, y luego codifique la palabra o frase 
     * ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
     * que se indica en la tabla y el resto de los caracteres (incluyendo a las 
     * vocales acentuadas) se mantienen sin cambios.
     * Realice un subprograma que reciba una secuencia de caracteres y retorne 
     * la codificación correspondiente. Utilice la estructura “según” 
     * para la transformación.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase_concat = "";
        String frase, fin;
        System.out.println("Ingrese una frase");
        int longitud;
      
        do {
        frase = leer.next();
        frase_concat= frase_concat.concat(frase);
        frase_concat=frase_concat.concat(" ");
        longitud= frase.length();
        fin= frase.substring(longitud-1,longitud);
        }while (!fin.equals("."));
        
        String convertida = conver (frase_concat);
        System.out.println(convertida);
    }
    public static String conver(String frase_concat) {
    	int longitud = frase_concat.length();
        String frase2 = "";
        String letra;
        for (int i=1; i<=longitud;i++){
           letra= frase_concat.substring(i-1,i);
           if (letra.equals(" ")){
               letra=" ";
           }
           switch (letra) {
               case "a": letra="@";
               break;
               case "e": letra="#";
               break;
               case "i": letra="$";
               break;
               case "o": letra="%";
               break;
               case "u": letra = "*";
               break;               
           } 
           frase2= frase2.concat(letra);
        }   
	return frase2;
    }
    
}
