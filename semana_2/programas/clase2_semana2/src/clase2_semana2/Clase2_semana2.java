/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_semana2;

/**
 *
 * @author johna
 */
public class Clase2_semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuadrado_2 c1 = new Cuadrado_2();
        System.out.println("lado cuadrado "+ c1.getLado());
        c1.setLado(50);
        System.out.println("lado cuadrado "+ c1.getLado());
        //Cuadrado_2 c2 = new Cuadrado_2(3);
        
        System.out.println(c1);
        
        final double num = 3.0;
        
        //num = 10;
        
    }
    
}
