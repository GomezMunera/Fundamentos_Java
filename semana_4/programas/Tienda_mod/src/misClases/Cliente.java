
//import misClases.;
package misClases;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona implements Acciones {
    
    private int ID;
    public String tipoCliente;
    public int telefono;
    public double promCompras;
    public double score;
    public String nombre;
    public ArrayList<Producto> misProd = new ArrayList<>();
            
    //Constructor
    public Cliente(){

    }
    
    public String toString(){
        return this.nombre;
        
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
    
    @Override
    public void alquilar(){
    
    }
    
    @Override        
    public void abonarCredito(){
    }
    
    @Override
    public void solicitarCredito(){
    }
    
    
}
