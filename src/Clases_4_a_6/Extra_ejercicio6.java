/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_4_a_6;

/**
 *
 * @author lucia
 */
public class Extra_ejercicio6 {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas que se
     * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        int personas = (int)(Math.random()*10);
        double altura;
        double total = 0.0;
        double altos_altura = 0.0;
        int altos=0;
        for (int i=1;i<=personas;i++){
            altura= 1 + Math.random();
            System.out.println("Persona " + i + " mide " + altura);
            total = total + altura;
            if (altura<= 1.60){
                altos_altura=altos_altura+altura;
                altos++;
            }
        }
        total = total/personas;
        altos_altura = altos_altura/altos;
        
        System.out.println("El promedio de estaturas por debajo a 1.60 es " + altos_altura);
        System.out.println("El promedio de estaturas en general es " + total);
    }
    
}
