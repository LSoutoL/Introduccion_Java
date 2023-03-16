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
public class Ejercicio6_practica {

    /**
     * @param args the command line arguments
     * Realizar un programa que pida dos números enteros positivos por teclado y
     * muestre por pantalla el siguiente menú:El usuario deberá elegir una 
     * opción y el programa deberá mostrar el resultado por pantalla y luego 
     * volver al menú. El programa deberá ejecutarse hasta que se elija la 
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en 
     * vez de salir del programa directamente, se debe mostrar el siguiente 
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
     * contrario se vuelve a mostrar el menú.

     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        String salir;
        salir = "";
        do {
        System.out.println("MENU:"
                +" 1. Sumar"
                +" 2. Restar"
                +" 3. Multiplicar"
                +" 4. Dividir"
                +" 5. Salir");
        System.out.println("Elegir opcion");
        opcion = leer.nextInt();
        int accion;
        switch (opcion) {
            case 1: accion=num1+num2;
                System.out.println(accion);
            break;
            case 2: accion=num1-num2;
            System.out.println(accion);
            break;
            case 3: accion = num1*num2;
            System.out.println(accion);
            break;
            case 4: accion = num1/num2;
            System.out.println(accion);
            break;
            case 5: System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    salir = leer.next();
            break;
        }
    } while (salir.equalsIgnoreCase("N") || opcion != 5);            
   
    }
    
}
