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
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha nacimiento = new Fecha(7, 24, 1949);
        Fecha contratacion = new Fecha(3, 12, 1988);
        Empleado empleado = new Empleado("Bob", "Blue", nacimiento, contratacion);
        
        System.out.println(empleado);
        System.out.println(nacimiento);

    }
    
}
