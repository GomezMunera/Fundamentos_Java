
package tienda1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Tienda1 {

    public String Nombre;
    public String ciudad;
    
    private int ID;

    
    
    public static void main(String[] args) throws IOException {

        Cliente andres = new Cliente();
        andres.telefono=2234433;
        andres.nombre="Andres García";
        
        Trabajador pedro = new Trabajador();
        pedro.nombre="Pedro Morales";
        
        Producto cocacola = new Producto(200,"Medellin", 50,"Cocacola");
        Producto pan = new Producto(200,"Medellin", 50, "Pan");
        Producto detergente = new Producto(200,"Medellin", 50, "Detergente");
        Producto chocolatina = new Producto(200,"Medellin", 50, "Chocolatina");
        
        for(int i=0; i<3;i++){
            andres.agregarProd();
        }
        
        System.out.println("hola---");
        for(Producto item: andres.misProd){
            System.out.println(item.nombre);
        }
        
        System.out.println("holaa");
        // Polimorfismo
        Persona alejo = new Cliente();
        
        System.out.println(alejo instanceof Cliente);
        System.out.println(alejo instanceof Persona);        
        
        System.out.println(alejo.getClass());
        
        //
        
        /*
        System.out.println("Ingrese el nombre del producto: ");
        Scanner entrada = new Scanner(System.in);
        
        String nombre = entrada.next();
        */
        


        
    }
    
    public void Contratar(Trabajador nTrabajador){
       
    }
 
    public void PagarArriendo(double canon){
    
    }
    
    public Producto[] Inventario(){
        
        Producto[] miInventario = new Producto[1];// Arreglo de objetos de tipo Producto
        
        return miInventario;
    }
    

    
    
}


