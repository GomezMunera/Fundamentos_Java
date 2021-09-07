/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5_variante1;

import java.util.ArrayList;

/**
 *
 * @author johna
 */
public class Reto5_variante1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Trabajador> trabajadores = new ArrayList <>();
        
        Trabajador t1 = new Trabajador("Daniel", "72023394", 70000, 96, 31, 8, 1981);
            //t2
        Trabajador t2 = new Trabajador("Mat", "1037681391", 67000, 80, 23, 1, 2000);
            //t3
        Trabajador t3 = new Trabajador("Johan", "33277591", 20000, 96, 24, 5, 1970);
            //t4
        Trabajador t4 = new Trabajador("Paulo", "1032678245", 40000, 96, 7, 3, 2001);
            //t5
        Trabajador t5 = new Trabajador("Paula", "34277819", 86000, 80, 11, 10, 1990);
            //t6
        Trabajador t6 = new Trabajador("Jorge", "72099568", 67000, 16, 10, 2, 1991);
        
        
        Nomina nomina1 = new Nomina();
        
        nomina1.agregarTrabajador(t1);
        
        trabajadores = nomina1.getTrabajadores();
        
        int tamano = trabajadores.size();
        
        System.out.println(trabajadores.get(0).getNombre());
        
    }
        
}
