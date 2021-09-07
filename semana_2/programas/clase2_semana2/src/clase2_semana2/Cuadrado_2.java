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
public class Cuadrado_2 {
    private double lado,lado1,lado2;
    
    
    public Cuadrado_2(){
        this.lado = 0;
        System.out.println("Constructor vacio");
    }
    
    public Cuadrado_2(double lado){
        this.lado = lado;
        System.out.println("Constructor con parámetro");
    }
    
    public double getLado(){
        return this.lado;
    }
    
    public void setLado(double l){
        //int lado3 = 4;
        this.lado = l;
    }
    
    public double area(double lado, double lado1){
        return lado*lado1;
    }
    
    public double area(double lado){
        return lado*lado;
    }
    
    @Override
    public String toString(){
        return "El objeto es: "+String.valueOf(this.lado);
    }
    
}
