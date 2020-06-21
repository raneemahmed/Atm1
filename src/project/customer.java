/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class customer {
   
    private double balance;

    private String cardNo;
    ArrayList<String> history = new ArrayList<>();
     int index=0;
    public customer(double balance, String cardNo) {
        this.balance = balance;
        this.cardNo = cardNo;
        
        
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardNo() {
        return cardNo;
    }
    
   
    
}

