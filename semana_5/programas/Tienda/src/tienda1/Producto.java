
package tienda1;


public class Producto {
    
    
    public double IVA;
    public double precio;
    public String lugar;
    public String moneda;
    public int stock;
    public int cantidad;
    public String nombre;
    
    public Producto(String nombre){
        this.nombre=nombre;
    
    }
    
    public Producto(double precIn, String lugarIn, int cantIn, String nomIn){
        this.lugar=lugarIn;
        this.cantidad=cantIn;
        precio=precIn;
        nombre=nomIn;
    }
    
    public void PonerPrecio(int precio){
        this.precio = precio;
    }
    
    public void CambiarLugar(String nuevoLugar){
        lugar = nuevoLugar;
    }
    
    public void CambiarLugar(){}
    
    public void PonerIva(double nIva){
        this.IVA = nIva;
    }
    
    public String toString(){
        return nombre;
    }
   

    
    
}
