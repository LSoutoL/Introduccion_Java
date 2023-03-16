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
public class Extra_ejercicio12 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        int j, k;
        String cad_i, cad_j, cad_k;
        
        for (int i=0; i<=9; i++){
            j=0;
            while (j<=9){
                k=0;
                while (k<=9){
                cad_i = String.valueOf(i);
                cad_j = String.valueOf(j);
                cad_k = String.valueOf(k);
                if (cad_i.equals("3")){
                    cad_i="E";
                }
                if (cad_j.equals("3")){
                    cad_j="E";
                }
                if (cad_k.equals("3")){
                    cad_i="E";
                }
                    System.out.println(cad_i + "-" + cad_j + "-" + cad_k);
                k++;    
            }
            j++;
            
        }
    }
    }
}
