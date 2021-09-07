/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejecucion;

/**
 *
 * @author SEBASTIAN RODRIGUEZ
 */
public class Trabajador extends Persona {
    public String empresa; //por lo general debe ir privada sino se debe poner metodo get y set
    public String cargo;
    
    public Trabajador(){
        this.empresa = "";
        this.cargo = "";
    }

    public Trabajador(String empresa, String cargo, String nombre,String genero,int edad){
        super(nombre,genero,edad); //aqui estamos llamando al constructor de la superclase persona
        this.empresa = empresa;
        this.cargo = cargo;
        //this.nombre = nombre; 
        //this.genero = genero;
        //this.edad = edad; 
    }
    @Override //esto es para indicarle una sobrecarga 
    public String toString(){
        return empresa + " " +super.edad; //polimorfismo dinamico//en lugar de super.edad puedo usar ((Persona)this).edad
    }
}
