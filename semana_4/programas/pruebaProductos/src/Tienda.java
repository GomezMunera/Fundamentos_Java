
import java.util.ArrayList;
import misClases.Producto;

public class Tienda {
    public String nombre;
    public String ciudad;
    public ArrayList<Producto> inventario = new ArrayList<>();
    
    private int ID;
    
    public Tienda(){}
    
    public Tienda(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    
    public void validarInventario(ArrayList inventario){
    
        System.out.println("Inventario validado");
        this.inventario=inventario;   
    }
    
}
