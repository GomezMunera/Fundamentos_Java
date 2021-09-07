
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Otros archivos
import modelo.modelo;
import vista.*;

public class controlador implements ActionListener{
    private vista vista1;
    private modelo modelo1;
    
    public controlador(){}
    
    public controlador (vista vista1, modelo modelo1){
        this.vista1 = vista1;
        this.modelo1 = modelo1;
        this.vista1.btnCalcularSuma.addActionListener(this);
        
        }
    
    public void iniciar(){
            this.vista1.setVisible(true);
        }
    
    @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==vista1.btnCalcularSuma){
                double num1 = Double.parseDouble(vista1.txtSumaNum1.getText()); 
                double num2 = Double.parseDouble(vista1.txtSumaNum2.getText());
                
                modelo1.setNumero1(num1);
                modelo1.setNumero2(num2);
                modelo1.sumar();
                
                String res = String.valueOf(modelo1.getResultado());
                
                vista1.txtSumaRes.setText(res);
            }
        }  
}

