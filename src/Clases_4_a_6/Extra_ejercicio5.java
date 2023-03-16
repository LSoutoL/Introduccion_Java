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
public class Extra_ejercicio5 {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
     * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
     * descuento en todos los tipos de tratamientos.
     * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
     * descuento para los mismos tratamientos que los socios del tipo A.
     * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
     * sobre dichos tratamientos.
     * Solicite una letra (carácter) que representa la clase de un socio, y 
     * luego un valor real que represente el costo del tratamiento (previo al 
     * descuento) y determine el importe en efectivo a pagar por dicho socio.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su clase de socio (A, B o C)");
        String socio = leer.next();
        System.out.println("Ingrese el costo del tratamiento");
        double costo = leer.nextDouble();
        double descuento=0;
        switch (socio) {
            case "a": descuento= costo*0.50;
            break;
            case "b":descuento= costo*0.35;
            break;
            case "c":descuento=0;
            break;
        }
        costo = costo - descuento;
        System.out.println("Por petenecer a la categoria " + socio + " debe abonar un total de " + costo + " pesos.");
    }
    
}
