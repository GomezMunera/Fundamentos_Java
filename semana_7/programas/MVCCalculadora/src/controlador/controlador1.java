
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.vista1;
import vista.vista2;


public class controlador1 implements ActionListener {
    
    private modelo mymodelo;
    private vista1 myvista;
    private vista2 myvista2;
    
    public controlador1(modelo modeloIn, vista1 vistaIn){
       
       this.mymodelo=modeloIn;
       this.myvista=vistaIn;
       
       // Se suscribe el botonsumar al tipo de acción que se desea escuchar
       this.myvista.btnSumar.addActionListener(this);
       
   
    }

    public controlador1(modelo modelIn, vista2 vistaIn) {
       this.mymodelo=modelIn;
       this.myvista2=vistaIn;

    }
    
    public void iniciar(){
         myvista.setVisible(true);
         //myvista2.setVisible(true);
    }
    
    public void controlSumar(){
        double num1 = Double.parseDouble(myvista.txtNum1.getText());
        double num2 = Double.parseDouble(myvista.txtNum2.getText());

        mymodelo.setNum1(num1);
        mymodelo.setnum2(num2);
        mymodelo.sumar();
        
        double suma=mymodelo.getResultado();  
        myvista.txtResultado.setText(String.valueOf(suma));

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==myvista.btnSumar){
            this.controlSumar();
            String comando = e.getActionCommand();
            System.out.println(comando);
        }
        
    }
    
    
    
}
