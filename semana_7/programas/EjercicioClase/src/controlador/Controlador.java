
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.*;

public class Controlador implements ActionListener {

    private Vista vista1;
    private Modelo modelo1;

    public Controlador(Vista vista1, Modelo modelo1) {
        this.vista1 = vista1;
        this.modelo1 = modelo1;
        this.vista1.btnsuma.addActionListener(this);
        this.vista1.btnresta.addActionListener(this);
        this.vista1.btnmultiplica.addActionListener(this);
    }
    
    public void inicio(){
        vista1.setVisible(true);
    }
  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        double num1,num2,res;
        
        num1 = Double.parseDouble(vista1.txtNum1.getText());
        num2 = Double.parseDouble(vista1.txtNum2.getText());
        
        //num1 = modelo1.getNumero1();
        //num2 = modelo1.getNumero2();
        
        modelo1.setNumero1(num1);
        modelo1.setNumero2(num2);
        
        
        if(e.getSource()==vista1.btnsuma){
            modelo1.sumar();
            res = modelo1.getResultado();
            
            vista1.txtResultado.setText(String.valueOf(res));
        }else if(e.getSource()==vista1.btnresta){
            modelo1.restar();
            res = modelo1.getResultado();
            
            vista1.txtResultado.setText(String.valueOf(res));
        }else if(e.getSource()==vista1.btnmultiplica){
            modelo1.multiplicar();
            res = modelo1.getResultado();
            
            vista1.txtResultado.setText(String.valueOf(res));
        }  
    }   
}
