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
public class Extra_ejercicio2 {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones 
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome 
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los 
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        int c = (int)(Math.random()*10);
        int d = (int)(Math.random()*10);
        System.out.println("Los valores iniciales de las variables son:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        int e = b;
        b = c;
        c = a;
        a = d;
        d = e;
        System.out.println("Los valores finales de las variables son:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
    }
    
}
