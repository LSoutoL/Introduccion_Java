/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_proyecto;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String apellido = "Souto";
        byte num = 1;
        double decims = 0.5;
        char letra = 'a';
        boolean comp = true;
        int centena = +100;
        
        String nombre;
  	char letra2;
        
        int numero = -48;
        double decimales = 3.55; 	
       
        
        int suma = num + numero ;
        int porcen = suma / centena;
        boolean bandera = suma < centena ;
        boolean menor = num > suma ;
        
        String nom = "Lucia";
        String ap = "Souto";
        System.out.println(nom + " " + ap);
        
        
        System.out.println("Ingresa tu nombre");
        
        nombre = leer.next();
        
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java");
        
        
    }
}
