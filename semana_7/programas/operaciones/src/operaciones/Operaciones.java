package operaciones;




import modelo.modelo;
import controlador.*;
import vista.*;

public class Operaciones {

  
    public static void main(String[] args) {
        vista vista1 = new vista();
        //vista2 vista = new vista2();
        modelo modelo1 = new modelo();
        
        controlador cont = new controlador(vista1,modelo1);
        cont.iniciar();
    }
    
}
