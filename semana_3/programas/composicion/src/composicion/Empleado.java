/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

/**
 *
 * @author johna
 */
public class Empleado {
    private final String nombre;
    private final String apellido;
    public Fecha fechaNacimiento;
    public Fecha fechaContratacion;
    
    // constructor para inicializar nombre, fecha de nacimiento y fecha de contratación
    public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento,
    Fecha fechaDeContratacion)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    // convierte Empleado a formato String
    public String toString()
    {
        return String.format("%s, %s Contratado: %s Cumpleanios: %s",
        this.apellido, this.nombre, this.fechaContratacion,
        this.fechaNacimiento);
    }
    
}
