/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_proyecto;


import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author lucia
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase;
        frase = leer.nextLine();
        
        String mayus = toUpperCase(frase);
        System.out.println(mayus);
        
        String minus = toLowerCase(frase);
        System.out.println(minus);
        
    }
    
}
