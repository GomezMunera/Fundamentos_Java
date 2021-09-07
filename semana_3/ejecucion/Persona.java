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
public class Persona {
    private String nombre; //se puede inicializar la variable al principio asi: private String nombre = "NN"
    public String genero;
    public int edad;
    
    public Persona(){
        this.nombre = "NN";
        this.genero = "NG";
        this.edad = 0;
    }
    //esto es sobrecarga
    public Persona(String nombre,String genero,int edad){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void info(){
        System.out.println(nombre); //nota: se puede poner this.nombre
        System.out.println(genero);
        System.out.println(edad);
    }
    
    @Override  //todas las clases heredan de la clase object que tiene un metodo llamado toString y por eso sobrecargamos el metodo
    public String toString(){ //
        return nombre;
    }

}
