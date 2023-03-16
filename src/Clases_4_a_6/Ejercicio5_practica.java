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
public class Ejercicio5_practica {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a
     * continuación solicite números al usuario hasta que la suma de los 
     * números introducidos supere el límite inicial
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma +=num;
        } while (suma <= limite);
 
    }
    
}
