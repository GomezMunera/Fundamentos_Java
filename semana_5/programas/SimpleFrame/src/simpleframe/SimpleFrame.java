/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleframe;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author johna
 */
public class SimpleFrame extends JFrame{
    public SimpleFrame(){
        final JLabel label = new JLabel("Test v1");
        label.setName("Label1");
        this.getContentPane().add(label, BorderLayout.NORTH);
 
        final JTextField text = new JTextField("");
        text.setName("Text1");
        this.getContentPane().add(text, BorderLayout.CENTER);
 
        JButton button = new JButton("Ok");
        button.setName("ButtonOk");
        
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText(text.getText());
            }
 
            @Override
            public void mousePressed(MouseEvent e) {
 
            }
 
            @Override
            public void mouseReleased(MouseEvent e) {
 
            }
 
            @Override
            public void mouseEntered(MouseEvent e) {
 
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
 
            }
        });
 
        this.getContentPane().add(button, BorderLayout.SOUTH);
 
        //this.pack();
        //this.setSize(800, 600);
        //this.setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleFrame();
    }
    
}
