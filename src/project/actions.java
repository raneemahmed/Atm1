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

/**
 *
 * @author DELL
 */
public class actions extends JFrame {

    JButton with = new JButton("Withdraw");
    
    JButton dep = new JButton("Deposit");
    JButton bi = new JButton("Balance Inquiry");
    JButton prev = new JButton("Previous");
    JButton nex = new JButton("Next");
    JButton back = new JButton("Back");
    JLabel label2 = new JLabel("");
    JLabel next= new JLabel("");
    JLabel previ = new JLabel("");
    MYATM s;

    public actions(customer c) {
        s = new MYATM(c);
        
        setLayout(null);
        add(label2);
        label2.setBounds(460, 160, 200, 60);
        add(with);
        with.setBounds(270, 70, 150, 30);
        add(dep);
        dep.setBounds(270, 120, 150, 30);
        add(bi);
        bi.setBounds(270, 170, 150, 30);
        add(prev);
        prev.setBounds(270, 220, 150, 30);
        add(nex);
        nex.setBounds(270, 270, 150, 30);
        add(back);
        back.setBounds(270, 370, 150, 30);
         add(next);
        next.setBounds(460, 260, 200, 60);
         add(previ);
        previ.setBounds(460, 210, 200, 60);
        bi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText(s.getcurrentBalance());

            }
        });
        with.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawscreen w = new withdrawscreen(s);
                w.setVisible(true);
                w.setSize(800, 900);
                setVisible(false);
            }
        });
        dep.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                depositscreen d = new depositscreen(s);
                d.setVisible(true);
                d.setSize(800, 900);
                setVisible(false);

            }
        });
        
         back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
              MYGUI g =  new MYGUI();
              g.setSize(800,900);
              g.setVisible(true);
                
                
               
           
             setVisible(false);

            }

            
        });
         
           nex.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                next.setText(s.next());
                
                
              

            }

            
        });
           
            prev.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              //  System.out.println(s.transcount);
                previ.setText(s.prev());
                
                
              

            }

            
        });
               

    }

}
