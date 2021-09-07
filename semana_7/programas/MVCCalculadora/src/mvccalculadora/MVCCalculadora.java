
package mvccalculadora;

import controlador.controlador1;
import modelo.modelo;
import vista.vista1;
import vista.vista2;


public class MVCCalculadora {


    public static void main(String[] args) {
       
       // crear el modelo
       modelo model1 = new modelo();
       
       // crear la vista
       vista1 espanol = new vista1();
       
       // crear el controlador
       controlador1 control1 = new controlador1(model1, espanol);
       control1.iniciar();
       
    }
    
}
