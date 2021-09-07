
package polimorfismo;
public class Cuadrado extends FiguraBidimensional {
    public double lado;
    
    public Cuadrado(String nombre){
        super(nombre);
    }
    public Cuadrado(String nombre, double lado){
        super(nombre);
        this.lado = lado;
    } 
    public Cuadrado(double lado){
        this.lado = lado;
    }    
    
    @Override
    public String area(){
        double a = lado*lado;
        return ("El área del cuadrado es: "+ String.valueOf(a));
    }
}