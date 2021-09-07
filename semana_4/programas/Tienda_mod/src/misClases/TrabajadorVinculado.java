
package misClases;

public class TrabajadorVinculado extends Trabajador {
    
    public int numSemCotizadas=0;
    public String nombre="oo";
    
    public void calcularCesantias(){
        System.out.println("El trabajador vinculado "
                            + super.nombre
                            + "Tiene "+this.numSemCotizadas+" Semanas cotizadas");
        
        //Accedemos a un método de la clase padre del padre es decir, Persona.
        super.suscribirse();
    }
    
}
