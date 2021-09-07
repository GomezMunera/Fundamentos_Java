
package tienda1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Tienda1 {

    public String Nombre;
    public String ciudad;
    
    private int ID;

    public static void main(String[] args) throws IOException {

        Cliente alejo = new Cliente();
        Cliente alejo2 = new Cliente();
        Cliente alejo3 = new Cliente();
        Persona ander =  new Trabajador();
        
        //polimorfismo
        //alejo.agregarProd();
        //ander.agregarProd();
        
        alejo.miCuenta.getSaldo();
        System.out.println(alejo2.miCuenta.getID());
        System.out.println(alejo3.miCuenta.getID());
    
        // Polimorfismo
        Persona alejo1 = new Cliente();
        
        System.out.println(alejo1 instanceof Cliente);
        System.out.println(alejo1 instanceof Persona);        
        System.out.println(alejo1.getClass());
        
        
        Cliente andres = new Cliente();
        andres.telefono=2234433;
        andres.nombre="Andres García";
        
        Trabajador pedro = new Trabajador();
        pedro.nombre="Pedro Morales";
        
        Producto cocacola = new Producto(200,"Medellin", 50,"Cocacola");
        Producto pan = new Producto(200,"Medellin", 50, "Pan");
        Producto detergente = new Producto(200,"Medellin", 50, "Detergente");
        Producto chocolatina = new Producto(200,"Medellin", 50, "Chocolatina");
        
        /*for(int i=0; i<3;i++){
            andres.agregarProd();
        }*/
        
        System.out.println("hola---");
        for(Producto item: andres.misProd){
            System.out.println(item.nombre);
        }
        
        System.out.println("holaa");
        

        int[] lista;
        
        ArrayList<Double> precios = new ArrayList<>();
        
        //Puedo Sobre escribir el método toString para que me retorne el nombre
        
        System.out.println("El nombre es: "+andres);
  
        
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


