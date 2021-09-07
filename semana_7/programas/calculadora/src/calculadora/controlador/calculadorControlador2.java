
package calculadora.controlador;

import calculadora.modelo.CalculadoraModelo;
import calculadora.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadorControlador2 implements ActionListener {
    private vista2 vista;
    private CalculadoraModelo modelo;
    
    calculadorControlador2(vista2 vista, CalculadoraModelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.calcular.addActionListener(this);
    }
    
     public void iniciar(){
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.label1.setText("¿Qué pasa boludo?");  
    }
}


