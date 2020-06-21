/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**m
 * 
 * 
 * 
 *
 * @author DELL
 */
public class MYGUI extends JFrame{
    JButton btn=new JButton("Login");
    JLabel label=new JLabel("card No.");
    JTextField txt=new JTextField(50);
    customer c=new customer(0,"12345");
    

    public MYGUI() {
        setLayout(null);
          add(label);
          label.setBounds(200,170,200,50);
          add(txt);
          txt.setBounds(250,180,150,30);
          add(btn);
          btn.setBounds(270,250,100,30);
          btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt.getText().equals(c.getCardNo())){
                    actions a=new actions(c);
                    a.setVisible(true);
                    a.setSize(800,900);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error");
                }
                }
            });
              
          
    }
    
    
    

    
}
