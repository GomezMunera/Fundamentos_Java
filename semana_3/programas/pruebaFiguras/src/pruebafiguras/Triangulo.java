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
public class Triangulo extends Figuras{
    
    
    public Triangulo(double l){
        super(l);
    }
    
    @Override
    public double area(double altura){
        return (lado*altura)/2;
    }
    
    @Override
    public String toString(){
        return String.valueOf(lado);
    }
    
}
