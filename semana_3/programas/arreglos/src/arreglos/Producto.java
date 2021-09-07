
package arreglos;


public class Producto {

    public double IVA;
    public double precio;
    public String lugar;
    public String moneda;
    public int stock;
    public int cantidad;
    public String nombre;
    
    /*
    public Producto(String nombre){
        this.nombre=nombre;
    }
    
    public Producto(double precIn, String lugarIn, int cantIn, String nomIn){
        this.lugar=lugarIn;
        this.cantidad=cantIn;
        precio=precIn;
        nombre=nomIn;
    }*/
    
    public String getProducto(){
        return nombre;
    }
    
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    public void CambiarLugar(String nuevoLugar){
    
    }
    
    public void setIva(double Iva){
        this.IVA = Iva;
    }
    
    public String toString(){
        return ("El nombre del producto es: " + this.nombre);
    }
   

    
    
}
