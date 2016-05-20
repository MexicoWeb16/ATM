/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Agustino Flores
 */
public abstract class Account 
{
    /**Constructs any random account
     * @param amount the amount of money in the account
    */
    public Account(double amount)
    {
        balance = amount;
    }
    
    /**
     * Used to deposit money into this account
     * @param amount money to be deposited
     */
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    /**
     * Used to withdraw money from this account
     * @param amount money to withdrawed
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    /**
     * Used to get the current balance of this account
     * @return balance: the current balance.
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Used to print out the Account object. To be implemented in subclasses.
     * @return 
     */
    public abstract String toString();
    
    private double balance;
}
