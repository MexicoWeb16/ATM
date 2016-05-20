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
public class CheckingAccount extends Account
{
    /**
     * Constructs a checking account extending Account.
     * @param amount The start amount for this account.
     */
    public CheckingAccount(double amount)
    {
        super(amount);
    }
    
    /**
     * Overrides the abstract toString method. Used to print out this CheckingAccount.
     * @return Checking Account string. 
     */
    @Override
    public String toString()
    {
        return "Checking Account Balance: " + getBalance();
    }
}
