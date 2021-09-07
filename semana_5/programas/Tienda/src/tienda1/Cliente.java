package tienda1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona implements Acciones {
    
    static int cantidadClientes;
    private int ID;
    public String tipoCliente;
    public int telefono;
    public double promCompras;
    public double score;
    public String nombre;
    public ArrayList<Producto> misProd = new ArrayList<>();
    public Cuenta miCuenta = new Cuenta();
            
    //Constructor
    public Cliente(){
        this.cantidadClientes += 1;
        this.ID += cantidadClientes; 
    }
    
    public Cliente(String nombre){
        this.nombre = nombre;
        this.cantidadClientes += 1;
        this.ID += cantidadClientes; 
    }
    
    public String toString(){
        return this.nombre;   
    }
    
    public int getID(){
        return ID;
    }
    
    @Override
    public void comprar(){
        //System.out.println("Metodo comprar");
        
        
    }
       
    public void agregarProd(){
        
        System.out.println("El cliente");
        Scanner nombreP = new Scanner(System.in);
        System.out.println("Ingrese el nombre del nuevo producto: ");
        String inputP=nombreP.next();
        Producto miprod = new Producto(inputP);
        misProd.add(miprod);    
        
    }
        
    public Factura comprar(Producto[] lista){
        System.out.println("El cliente " + nombre + " acaba de realizar una compra");
        
        Factura mifactura = new Factura(lista);// creamos e inicializamos un objeto tipo factura
              
        return mifactura;
        
    }
    
    public Factura comprarCredito(Producto[] lista){
        
        Factura mifactura = new Factura(lista);// creamos e inicializamos un objeto tipo factura
        
        return mifactura;
        
    }
    
    
    public double PagarCredito(double pago){
    
        double saldo =0;
        
        return saldo;
    }
    
}
