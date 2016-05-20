/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.ArrayList;

/**
 *
 * @author Agustino Flores
 */
public class ATMDriver 
{

    /**
     * Used to run the ATM program.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount(12345, 1234));
        accounts.add(new BankAccount(7118451, 7118));
        accounts.add(new BankAccount(98765, 2345));
        ATM atm = new ATM(accounts);
        atm.start();
    }
    
}
