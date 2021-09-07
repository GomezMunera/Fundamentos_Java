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
public class PHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p2 = new Persona();
        Persona p1 = new Persona("Camila");
        Empleado e1 = new Empleado();
        e1.nombre = "lUISA";
        e1.setNombre("Ana");
        e1.setEmpresa("Claro");
        System.out.println(e1.getEmpresa());
        System.out.println(e1.getNombre());
        System.out.println(e1.toString());
        
        EmpleadoAsalariado ea1 = new EmpleadoAsalariado();
        ea1.setNombre("German");
        ea1.setEmpresa("Ecopetrol");
        ea1.setSalario(2000);
        System.out.println(ea1.toString());
    }
    
}
