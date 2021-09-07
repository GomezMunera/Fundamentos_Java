
package tienda1;


public class Producto {
    
    
    public double IVA;
    public double precio;
    public String lugar;
    public String moneda;
    public int stock;
    public int cantidad;
    public String nombre;
    
    public Producto(double precIn, String lugarIn, int cantIn, String nomIn){
        this.lugar=lugarIn;
        this.cantidad=cantIn;
        precio=precIn;
        nombre=nomIn;
    }
    
    public void PonerPrecio(int precio){
    
    }
    
    public void CambiarLugar(String nuevoLugar){
    
    }
    
    public void PonerIva(double nIva){
    
    }
   

    
    
}
