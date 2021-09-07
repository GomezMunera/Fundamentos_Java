/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulodescendente;

import java.util.Scanner;

/**
 *
 * @author johna
 */
public class TrianguloDescendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alto, bajo, cruce;
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el alto: ");
        alto = teclado.nextInt();
        
        // ciclos
        for( bajo = alto; bajo>=1; bajo --){
            for(cruce = 1; cruce <= bajo - 1; cruce ++){
                System.out.print("*");
            }
            System.out.println("*");
        
        }
        
        System.out.println(Math.max(2, 8));
        
    }
    
}
