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
public class BankAccount 
{
    /**
     * Constructs a new BankAccount that has both a SavingsAccount and CheckingAccount
     * @param num Customer Number
     * @param pin Personal Identification Number that has to consist of 4 digits
     */
    public BankAccount(int num, int pin)
    {
        if(String.valueOf(pin).length() == 4)
        {    
            customerNumber = num;
            PIN = pin;
            
            checking = new CheckingAccount(0);
            savings = new SavingsAccount(0);
        }
        else
            System.out.println("PIN must be a 4 digit number!");
    }
    
    /**
     * Gets the customer number for this BankAccount.
     * @return customerNumber: the customer number.  
     */
    public int getCustomerNumber()
    {
        return customerNumber;
    }
    
    /**
     * Gets the PIN for this BankAccount
     * @return PIN: the 4 digit PIN number 
    */
    public int getPIN()
    {
        return PIN;
    }
    
    /**
     * Gets the CheckingAccount for this BankAccount
     * @return checking: the checking account. 
    */
    public CheckingAccount getChecking()
    {
        return checking;
    }
    
    /**
     * Gets the SavingsAccount for this BankAccount
     * @return savings: the savings account.
     */
    public SavingsAccount getSavings()
    {
        return savings;
    }
    
    private int customerNumber, PIN;
    private CheckingAccount checking;
    private SavingsAccount savings;
}
