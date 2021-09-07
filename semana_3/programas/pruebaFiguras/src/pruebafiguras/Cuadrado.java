/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafiguras;

/**
 *
 * @author johna
 */
public class Cuadrado extends Figuras {
   
    public Cuadrado(double l){
        super(l);
    }
    
    @Override
    public double area(double lado){
        return lado*lado;
    }
    
    

    
}
