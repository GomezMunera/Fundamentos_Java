/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5_variante1;

//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;
public class Nomina {

    //Inserte acá los atributos
    private ArrayList <Trabajador> trabajadores = new ArrayList <>();
    
    //Inserte acá el método constructor
    public Nomina(){
        this.trabajadores = trabajadores;
    }
    
    //Inserte acá los SETTERS Y GETTERS
    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void agregarTrabajador(Trabajador t){
        boolean n = false;
        
        for (int i = 0; i < this.trabajadores.size();i++){
            if (t.getCC().equalsIgnoreCase(trabajadores.get(i).getCC())){
                n = true;
            }
        }
            
        if (!n){
            trabajadores.add(t);
        }
    }
    
    public void eliminarTrabajador(String id){
        
        for (int i = 0; i < this.trabajadores.size();i++){
            if (id.equalsIgnoreCase(trabajadores.get(i).getCC())){
                this.trabajadores.remove(i);
            }
        }
    }
    
    public double calcularSalarioQuincenalNomina(){
        double suma=0;
        
        for (int i = 0; i < this.trabajadores.size();i++){
            suma += trabajadores.get(i).salarioQuincenal();
        }
        
        return suma;
    }
    
    public double promedioEdadNomina(){
        double promedio,suma = 0;
        
        for (int i = 0; i < this.trabajadores.size();i++){
            suma += trabajadores.get(i).calcularEdad();
        }
        
        promedio = suma / this.trabajadores.size();
        
        return promedio;
    }
    
    public double desviacionEstandarEdadNomina(){
        double desviacion,suma=0,promedioEdadNomina;
        
        promedioEdadNomina = promedioEdadNomina();
        
        for (int i = 0; i < this.trabajadores.size();i++){
            suma += Math.pow((trabajadores.get(i).calcularEdad() - promedioEdadNomina),2);
        }
        
        desviacion = Math.sqrt(suma/this.trabajadores.size());
        
        return desviacion;
    }
    
    public double salarioQuincenalTrabajador(String ID){
        int n=-1;
        double salario;
        
        for (int i = 0; i < this.trabajadores.size();i++){
            if (ID.equalsIgnoreCase(trabajadores.get(i).getCC())){
                n=i;
            }
        }
        
        if(n!=-1){
            salario = trabajadores.get(n).salarioQuincenal();
        }
        else {
            salario = n;
        }
        
        return salario;
    }
}