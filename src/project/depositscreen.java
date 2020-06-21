
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class depositscreen extends JFrame {

    JButton zeroo = new JButton("0");
    JButton onee = new JButton("1");
    JButton twoo = new JButton("2");
    JButton threee = new JButton("3");
    JButton fourr = new JButton("4");
    JButton fivee = new JButton("5");
    JButton sixx = new JButton("6");
    JButton sevenn = new JButton("7");
    JButton eightt = new JButton("8");
    JButton ninee = new JButton("9");
    JButton okk = new JButton("OK");
    JButton backkk = new JButton("Back to menu");
    JTextField amountt = new JTextField(50);
    
MYATM s;
    public depositscreen(MYATM c) {
        s=c;

        
        setLayout(null);
        add(zeroo);
        zeroo.setBounds(220, 120, 60, 60);
        add(onee);
        onee.setBounds(280, 120, 60, 60);
        add(twoo);
        twoo.setBounds(340, 120, 60, 60);
        add(threee);
        threee.setBounds(400, 120, 60, 60);
        add(fourr);
        fourr.setBounds(220, 180, 60, 60);
        add(fivee);
        fivee.setBounds(280, 180, 60, 60);
        add(sixx);
        sixx.setBounds(340, 180, 60, 60);
        add(sevenn);
        sevenn.setBounds(400, 180, 60, 60);
        add(eightt);
        eightt.setBounds(220, 240, 60, 60);
        add(ninee);
        ninee.setBounds(400, 240, 60, 60);

        add(okk);
        okk.setBounds(300, 300, 80, 30);
        add(amountt);
        amountt.setBounds(260, 50, 160, 30);
        add(backkk);
        backkk.setBounds(260, 350, 160, 30);
        zeroo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText()+0);

            }
        });
        onee.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText() + 1);

            }
        });
        twoo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText() + 2);

            }
        });
        threee.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText() + 3);

            }
        });
        fourr.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText() + 4);

            }
        });
        fivee.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText() + 5);

            }
        });
        sixx.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText() + 6);

            }
        });
        sevenn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText() + 7);

            }
        });

        eightt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText() + 8);

            }
        });
        ninee.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amountt.setText(amountt.getText() + 9);

            }
        });

        okk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                s.deposit(amountt.getText());
                JOptionPane.showMessageDialog(null, "SUCCESSFULL DEPOSIT WITH "+amountt.getText());

            }
        });

        backkk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

              actions b = new actions(s.c);
               b.setSize(800, 900);
               b.setVisible(true);

                setVisible(false);

            }
        });

    }
}
