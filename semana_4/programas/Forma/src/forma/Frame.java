package forma;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener{
    
         JButton boton1, boton2;
        ArrayList<JButton> botones = new ArrayList<>();
        
        public Frame(){
            this.setLayout(null);
            this.setBounds(20,20,400,400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            boton1 = new JButton();
            boton1.setText("Pulsar");
            boton1.setBounds(150,100,100,40);
            boton1.setVisible(true);
            this.add(boton1);
            boton1.addActionListener(this);       
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            for(int i=1;i<=5;i++){
                JButton boton = new JButton();
                boton.setBounds(30*i, 60*i,100,40);
                boton.setText("Boton "+i);
                boton.setVisible(true);
                add(boton);
                boton.addActionListener(this);
                botones.add(boton);
            }
        }
        repaint();
    }          
}
        