
package tienda1;

public class Tienda1 {

    public String Nombre;
    public String ciudad;
    
    private int ID;

    public static void main(String[] args) {

        Cliente andres = new Cliente();
        andres.telefono=2234433;
        andres.nombre="Andres García";
        
        Trabajador pedro = new Trabajador();
        pedro.nombre="Pedro Morales";
        
        Producto cocacola = new Producto(200,"Medellin", 50,"Cocacola");
        Producto pan = new Producto(200,"Medellin", 50, "Pan");
        Producto detergente = new Producto(200,"Medellin", 50, "Detergente");
        Producto chocolatina = new Producto(200,"Medellin", 50, "Chocolatina");
        
        Producto[] listaCompra = {cocacola, pan, detergente, chocolatina};  
                
        andres.comprar(listaCompra);//Le decimos al cliente andres que ejecute la compra y retorna una factura
        
        System.out.println(pedro instanceof Trabajador);

        
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
