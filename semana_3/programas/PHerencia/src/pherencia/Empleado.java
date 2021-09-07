/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia;

/**
 *
 * @author johna
 */
public class Empleado extends Persona{
    private String empresa;
    
    public void setEmpresa(String e){
        this.empresa = e;
    }
    
    public String getEmpresa(){
        return this.empresa;
    }
    
    @Override
    public String toString(){
        String texto = "Empleado: " + getNombre()+ "\n";
        texto = texto + "Empresa: " + this.empresa;
        return texto;
    }
}
