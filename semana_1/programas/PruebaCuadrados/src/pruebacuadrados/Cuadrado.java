/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacuadrados;

/**
 *
 * @author johna
 */
public class Cuadrado {
    
    private int lado;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    public int getLado(){
        return this.lado;
    }
    
    void setLado(int lado){
        this.lado = lado;
    }
    
    // método to string
    @Override
    public String toString(){
        int i, espacios;
        String resultado = "";
        
        for(i=0;i<this.lado;i++){
            resultado += "◻"; 
        }
        resultado += "\n";
        /*
        for(i=1; i<this.lado-1;i++){
            resultado += "◻◻"; 
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += " ";
            }
            resultado += "◻◻\n"; 
        }
        for (i = 0; i < this.lado; i++) {
            resultado += "";
        }
        */
        return resultado;
    }
    
}
