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
public class Figuras {
    
    public double lado;
    
    public double area(double lado){
        return lado*lado;
    }
    
    public Figuras(double lado){
        this.lado = lado;
    }
}
