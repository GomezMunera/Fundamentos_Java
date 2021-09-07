
package misClases;

//import misClases.Trabajador;

public class Factura {
    
    private static int conFac;
    private int ID;
    public Cliente Comprador;
    public Producto[] lista;
    public boolean pagada;
    public String tipoPago;
    public Trabajador vendedor;
    
    public Factura(Producto[] listaIn){
        
        for(int i=0; i<listaIn.length; i++ ){
            System.out.println("El producto: "+ listaIn[i].nombre + " con precio: " + listaIn[i].precio);
        }
       
    }

    public double total(){
        double totalCompra=0;
        
        return totalCompra;

    }

    
}
