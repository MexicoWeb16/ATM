/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Us
 */
public class ATM 
{
    /**
     * Constructs a new ATM that works as a real ATM.
     * @param bankAccounts The BankAccounts associated with this ATM. 
     */
    public ATM(List<BankAccount> bankAccounts)
    {
        accounts = bankAccounts;
    }
    
    /**
     * Begins the ATM by allowing the user to input their customer number and PIN.
     */
    public void start()
    {
        System.out.println("ATM \n Please enter your customer number and 4 digit PIN number.");
        Scanner input = new Scanner(System.in);
        
        try
        {
            int customerNumber = input.nextInt();
            int pinNumber = input.nextInt();
            
            currentAccount = searchForUser(customerNumber, pinNumber);
            if(currentAccount != null)
                accountTransactions();
             else
            {
                System.out.println("Account not found. Try again.");
                start();
            }
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Please try again.");
            start();
        }
        
        
    }
    
    /**
     * Used to decide whether the customer wants to use their Checkings or Savings Account.
     */
    private void accountTransactions()
    {
        System.out.println("Please select an account. \n 1 for Checkings, 2 for Savings");
        Scanner input = new Scanner(System.in);
        
        try
        {
            int selection = input.nextInt();
            
            switch(selection)
            {
                case 1: singleTransaction(currentAccount.getChecking());
                        break;
                case 2: singleTransaction(currentAccount.getSavings());
                        break;
                default: System.out.println("Please enter a 1 or a 2");
                         accountTransactions();
                         break;
            }
            
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Please enter an integer.");
            input.nextLine();
        }
    }
    
    /**
     * Runs the transactions of a specific account. Allows the customer to decide between depositing or withdrawing from a specific account.
     * @param account The account used to run transactions off of.
     */
    private void singleTransaction(Account account)
    {
        System.out.println(account);
        Scanner input = new Scanner(System.in);
        
        try
        {
            System.out.println("Would you like to deposit(1) or withdraw(2)");
            int selection = input.nextInt();
            
            switch(selection)
            {
                case 1: System.out.println("Enter amount you would like to deposit");
                        account.deposit(input.nextDouble());
                        break;
                case 2: System.out.println("Enter amount you would like to withdraw");
                        account.withdraw(input.nextDouble());
                        break;
                default: System.out.println("Please enter a 1 or a 2.");
                         singleTransaction(account);
                         break;
            }
            
            System.out.println("Would you like to do another transaction? 1 for yes 2 for no.");
            selection = input.nextInt();
            switch(selection)
            {
                case 1: accountTransactions();
                        break;
                case 2: System.out.println("Thank you for time. Please come again!");
                        break;
                default: System.out.println("Unable to process your choice. Your session is now over. Please come again!");
                         break;
            }
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Please input a number next time");
            input.nextLine();
        }
    }
    
    /**
     * Searches for a BankAccount with the specific customer number and PIN and returns it.
     * @param customerNumber The Customer Number.
     * @param pinNumber The 4 digit PIN
     * @return The BankAccount that has the customer number and PIN.
     * @return null if no BankAccount was found. 
     */
    private BankAccount searchForUser(int customerNumber, int pinNumber)
    {
        for(int i = 0; i < accounts.size(); i++)
           if(customerNumber == accounts.get(i).getCustomerNumber() && pinNumber == accounts.get(i).getPIN())
               return accounts.get(i);
        
        return null;
    }
    
    private List<BankAccount> accounts;
    private BankAccount currentAccount;
}
