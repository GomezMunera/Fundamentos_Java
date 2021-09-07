/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;

/**
 *
 * @author alejo
 */
public class vista1 {
    public Principal ventana = new Principal();
    public void iniciar() {
        ventana.setVisible(true);
    }

    public void mostrarDatos(ArrayList<Integer> cedulaCliente,
                             ArrayList<String> nombreCliente, 
                             ArrayList<String> apellidoCliente,
                             ArrayList<Integer> num_compra,
                             ArrayList<String> nombreVendedor,
                             ArrayList<String> apellidoVendedor, 
                             ArrayList<String> lugar) {
        
        int tope = cedulaCliente.size();
        String [] datos = new String [7];
        
        for(int i=0; i<tope;i=i+1){
            datos[0] = String.valueOf(cedulaCliente.get(i));
            datos[1] = String.valueOf(nombreCliente.get(i));
            datos[2] = String.valueOf(apellidoCliente.get(i));
            datos[3] = String.valueOf(num_compra.get(i));
            datos[4] = String.valueOf(nombreVendedor.get(i));
            datos[5] = String.valueOf(apellidoVendedor.get(i));
            datos[6] = String.valueOf(lugar.get(i));
            ventana.modeloTabla.addRow(datos);
        }
    }
    
}
