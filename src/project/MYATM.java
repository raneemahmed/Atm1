/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MYATM implements ATM {

    customer c;

    public MYATM(customer c) {
        this.c = c;
    }

    @Override
    public String getcurrentBalance() {

        String balance;
        return c.getBalance() + "";

    }

    @Override
    public void withdraw(String amount) {

        double x = Double.parseDouble(amount);
        if (c.getBalance() > x) {
            double current = c.getBalance();
            c.setBalance(current - x);

            if (c.history.size() == 5) {
                c.history.remove(0);
                c.history.add("withdraw " + amount);
                c.index= 5;
            } else {
                c.history.add("withdraw " + amount);
                c.index++;
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    @Override
    public void deposit(String amount) {
        double x = Double.parseDouble(amount);

        double current = c.getBalance();
        c.setBalance(current + x);

        if (c.history.size() == 5) {
            c.history.remove(0);
            c.history.add("Deposit " + amount);
            c.index = 5;
        } else {
            c.history.add("Deposit " + amount);
           c.index++;
        }
    }

    @Override
    public String prev() {
        if (c.index== 0 ) {
            return ("There is no previous transactions");
        } else {
            return (c.history.get(--c.index));
        }
    }

    @Override
    public String next() {
        if (c.index==4||(c.history.size())==0) {
            return ("There is no following transactions");
        } else {
            return (c.history.get(++c.index));
        }

    }

    @Override
    public void donate(String amount) 
        
        
    {

        double x = Double.parseDouble(amount);
        if (c.getBalance() > x) {
            double current = c.getBalance();
            c.setBalance(current - x);

       
            if(c.getBalance()<500)
            {
                JOptionPane.showMessageDialog(null, "your balance is less than 500");
            }

            
    }

    

}
}
