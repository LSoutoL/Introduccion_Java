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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("El resultado de la suma de esos numeros es " + suma);
    }
    
}
