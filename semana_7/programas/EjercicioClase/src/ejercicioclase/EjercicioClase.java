
package ejercicioclase;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class EjercicioClase {

    public static void main(String[] args) {
        // llamar la vista
        Vista vista1 = new Vista();
        
        //modelo
        Modelo modelo1 = new Modelo();
        
        //controlador
        Controlador c1 = new Controlador(vista1,modelo1);
        c1.inicio();
    }   
}
