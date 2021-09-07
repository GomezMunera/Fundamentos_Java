
package tienda1;

//Importo el paquete de mis clases
import misClases.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Tienda1 {

    public String Nombre;
    public String ciudad;
    public static ArrayList<Producto> inventario = new ArrayList<>();
    
    private int ID;
    
    public static void main(String[] args) throws IOException {

        ArrayList<Producto> inventario = new ArrayList<>();
        
        Trabajador Francisco = new Trabajador();
        Francisco.nombre="Francisco";
        
        Francisco.cargarInventario();
        Francisco.imprimirInventario();
               
        validarInventario(Francisco.inventario);
               
        
        
        
        
        
        
    
        
                
        
        
        
        
        
        
        
        TrabajadorVinculado nuevoTrab = new TrabajadorVinculado();
        
        //Metodos y atributos que hereda la clase TrabajadorVinculado, desde Trabajador y Persona.
        System.out.println("Nombre: "+nuevoTrab.nombre);
        nuevoTrab.agregarProd();
        
        //metodos y atributos propios de la clase TrabajadorVinculado
        System.out.println("Sem Cotizadas"+ nuevoTrab.numSemCotizadas);
        nuevoTrab.calcularCesantias();
        
        //Llamo un método heredado de la clase Persona de la cual hereda Trabajador
        //que a su vez es la clase de la que hereda TrabajadorVinculado
        nuevoTrab.suscribirse();
       
        Persona alejo = new Cliente();
        Persona ander =  new Trabajador();

        //polimorfismo
        alejo.agregarProd();
        ander.agregarProd();
        
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
        
        Producto[] lista={cocacola,pan,detergente,chocolatina};
        
        
        for(int i=0; i<3;i++){
            andres.agregarProd();
        }
        
        System.out.println("hola---");
        for(Producto item: andres.misProd){
            System.out.println(item.nombre);
        }
        
        System.out.println("holaa");
        

        
        
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
    
    public static void validarInventario(ArrayList inventario){
    
        System.out.println("Inventario validado");
        Tienda1.inventario=inventario;
        
    }
    

    
    
}


