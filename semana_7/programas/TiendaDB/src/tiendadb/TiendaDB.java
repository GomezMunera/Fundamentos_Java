
package tiendadb;

import controlador.controlador1;
import java.sql.SQLException;
import modelo.modelo1;
import vista.vista1;


public class TiendaDB {

    //Las excepciones se añaden ya que las otras clases las llaman
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
       vista1 myvista = new vista1();
       modelo1 mymodelo = new modelo1();
       
       controlador1 mycontrol =  new controlador1(myvista,mymodelo);
       mycontrol.iniciar();
 
    }
    
}
