package tienda1;

public class Cliente {
    
    private int ID;
    public String tipoCliente;
    public int telefono;
    public double promCompras;
    public double score;
    public String nombre;
    
            
    //Constructor
    public Cliente(){
    
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
