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
public class Ejercicio10_guiabis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese 4 valores entre 1 y 20.");
        
        for (int i=0; i<4; i++){
            
            Scanner leer1= new Scanner(System.in);
            int num1 = leer1.nextInt();
            while (num1<1 || num1>20){
                System.out.println("Ingrese valor entre 1 y 20.");
                num1 = leer1.nextInt();
                }
                System.out.print(num1);
            for (int j=0; j<num1; j++){
                
                System.out.print("*");
            }
            
                System.out.println("");
                
            
            
            
            
        
    }
        
        
    }
    
}