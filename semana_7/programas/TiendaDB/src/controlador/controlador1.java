/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import modelo.modelo1;
import vista.vista1;

public class controlador1 implements ActionListener {
    private modelo1 myModelo;
    private vista1 myVista;
    
    public controlador1(vista1 vistaIn, modelo1 modeloIn){
        this.myModelo=modeloIn;
        this.myVista=vistaIn;
    }
    
    public void  iniciar() throws SQLException {
        myVista.iniciar();
        this.myVista.ventana.btnResumen.addActionListener(this);
        // TRAER LA 
        //this.controlResumen();
        
    }
    
    public void controlResumen() throws SQLException{
        
        String sqlConsulta =    "SELECT c.nombre_1 as nombreCliente,\n" +
                                "c.apellido_1 as apellidoCliente,\n" +
                                "c.cc as cedulaCliente,\n" +
                                "v.nombre as nombreVendedor, \n" +
                                "v.apellido as apellidoVendedor,\n" +
                                "f.num_compra, f.lugar\n" +
                                "FROM cliente c, vendedor v, factura f, detalle d\n" +
                                "WHERE c.cc = f.Cliente_cc\n" +
                                "ORDER BY f.num_compra ASC;";
        
        myModelo.ejeConsulta(sqlConsulta);
        System.out.println(myModelo.apellidoCliente.toString());
        
        myVista.mostrarDatos(myModelo.cedulaCliente,
                             myModelo.nombreCliente, 
                             myModelo.apellidoCliente,
                             myModelo.num_compra,
                             myModelo.nombreVendedor,
                             myModelo.apellidoVendedor,
                             myModelo.lugar
                             );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==myVista.ventana.btnResumen){
            try {
                this.controlResumen();
            } catch (SQLException ex) {
                 System.out.println("Hubo un error al acceder a la base de datos: " + ex.getMessage());
            }
            
            String comando = e.getActionCommand();
            System.out.println(comando);
        }
    }
    
}
