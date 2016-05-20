/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Us
 */
public class SavingsAccount extends Account
{
    /**
     * Constructs a saving account extending Account.
     * @param amount The start amount for this account.
     */
    public SavingsAccount(double amount)
    {
        super(amount);
    }
    
    /**
     * Overrides the abstract toString method. Used to print out this SavingsAccount.
     * @return Saving Account string. 
     */
    @Override
    public String toString()
    {
        return "Savings Account Balance: " + getBalance();
    }
}
