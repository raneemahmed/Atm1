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
public class withdrawscreen extends JFrame {

    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton ok = new JButton("OK");
    JButton backk = new JButton("Back to menu");
    JTextField amount = new JTextField(50);
    MYATM m;

    public withdrawscreen(MYATM c) {
        m=c;

        
        setLayout(null);
        add(zero);
        zero.setBounds(220, 120, 60, 60);
        add(one);
        one.setBounds(280, 120, 60, 60);
        add(two);
        two.setBounds(340, 120, 60, 60);
        add(three);
        three.setBounds(400, 120, 60, 60);
        add(four);
        four.setBounds(220, 180, 60, 60);
        add(five);
        five.setBounds(280, 180, 60, 60);
        add(six);
        six.setBounds(340, 180, 60, 60);
        add(seven);
        seven.setBounds(400, 180, 60, 60);
        add(eight);
        eight.setBounds(220, 240, 60, 60);
        add(nine);
        nine.setBounds(400, 240, 60, 60);

        add(ok);
        ok.setBounds(300, 300, 80, 30);
        add(amount);
        amount.setBounds(260, 50, 160, 30);
        add(backk);
        backk.setBounds(260, 350, 160, 30);
        zero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 0);

            }
        });
        one.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 1);

            }
        });
        two.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 2);

            }
        });
        three.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 3);

            }
        });
        four.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 4);

            }
        });
        five.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 5);

            }
        });
        six.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 6);

            }
        });
        seven.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 7);

            }
        });

        eight.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 8);

            }
        });
        nine.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                amount.setText(amount.getText() + 9);

            }
        });

        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                m.withdraw(amount.getText());
                if(Double.parseDouble(m.getcurrentBalance())>Double.parseDouble(amount.getText()))
                JOptionPane.showMessageDialog(null, "SUCCESSFULL WITHDRAW WITH " + amount.getText());

            }
        });

        backk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                actions b = new actions(m.c);
               b.setSize(800, 900);
                b.setVisible(true);

                setVisible(false);

            }
        });

    }
}
