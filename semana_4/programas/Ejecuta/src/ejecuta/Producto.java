
package ejecuta;

public class Producto {
    
    public double IVA;
    public double precio;
    public String lugar;
    public String moneda;
    public int stock;
    public int cantidad;
    public String nombre;
    public int id;
    
    public Producto(String nombre){
        this.nombre=nombre;
    }
    
    public Producto(String nombre, int stock,int id){
        this.nombre = nombre;
        this.stock = stock;
        this.id = id;
    }
    
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
    
    public void CambiarLugar(){}
    
    public void PonerIva(double nIva){
    
    }
    
    @Override
    public String toString(){
        
        return this.nombre;
    }
   

    
    
}
