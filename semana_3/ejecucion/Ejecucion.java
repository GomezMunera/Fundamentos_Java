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
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Trabajador empleado1 = new Trabajador();
        Trabajador empleado2 = new Trabajador("Fenix","Programador","Kevin","Masculino",23);

        empleado1.info();
        empleado2.info();
        System.out.println(empleado1);
        System.out.println(empleado2);
    }
}
