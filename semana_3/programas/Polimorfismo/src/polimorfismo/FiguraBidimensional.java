
package polimorfismo;
public class FiguraBidimensional {
    public String nombre;

    public FiguraBidimensional(){}
    public FiguraBidimensional(String nombre){
        this.nombre = nombre;
    }
    
    public String area(){
        return ("No se puede calcular el área");
    }
}
