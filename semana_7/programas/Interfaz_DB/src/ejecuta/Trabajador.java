package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;

public class Trabajador extends Persona{
    
    // Array list que guarda la compra
    public ArrayList<Producto> misProd = new ArrayList<>();
    
    //Array list que guarda el inventario
    public ArrayList<Producto> inventario = new ArrayList<>();
    
    public String nombre="NULO";
    public String password;
    
    
    public Trabajador(){}
    
    public Trabajador(String nombre, String password){
        this.nombre = nombre;
        this.password = password;
    }

    @Override
    public void agregarProd(){
        
        System.out.println("El trabajador");
        Scanner nombreP = new Scanner(System.in);
        System.out.println("Ingrese el nombre del nuevo producto: ");
        String inputP=nombreP.next();
        Producto miprod = new Producto(inputP);
        misProd.add(miprod);    
        
    }
    
    public void cargarInventario(){
        // el trabajador ingrese el nombre del producto y la cantidad quehay.
        // producto.stock: guarda la cantidad de productos que hay en el inventario.
        // El iventario dondeq queda? 
        
        // Defino el scanner para leer los datos
        Scanner textoIn = new Scanner(System.in);
        // Defino la variable que recibe los datos
        String inputS ="";
        
        System.out.print("Desea cargar un inventario? S: Si, N: No ");
        inputS=textoIn.next();
        
        while(inputS.equals("S")){
            
            System.out.print("Ingrese el nombre del producto: ");
            //Guardo el nombre del producto que ingresa el usuario en la variable inputS
            inputS=textoIn.next();

            //Creo una instancia de Producto con el nombre que me dió el usuario
            Producto miprod = new Producto(inputS);

            // Añadimos la cantidad en stock de cada producto
            System.out.print("Ingrese el stock del producto: "
                            + miprod.nombre + ": " );
            //Variable para ingresar el stock
            int cantidad=0;
            cantidad=textoIn.nextInt();
            //Actualizamos el stock del producto
            miprod.stock=cantidad;

            //Añadimos un producto al inventario
            this.inventario.add(miprod);
            
            System.out.print("Desea ingresar un producto adicional? S: Si, N: No ");
            inputS=textoIn.next();   
        }
    }
    
    public void imprimirInventario(){
    
        System.out.println("--- Inventario ---");
        for(Producto item: this.inventario){
            System.out.printf("%-20s %d %n",item.nombre,item.stock);
        }
    }
    
}
