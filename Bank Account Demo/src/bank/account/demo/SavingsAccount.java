/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.account.demo;

/**
 *
 * @author kmhasan
 */
public class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(int accountNumber,
            String accountName,
            String address,
            double balance,
            double interestRate) {
        super(accountNumber, accountName, address, balance);
        this.interestRate = interestRate;
    }
    /*
    initial balance = 1000
    interest rate = 10%
    deposit amount = 200
    new balance = 1000 + 100 + 100 * 10%
    = 1120
    */
    @Override
    public void deposit(int amount) {
        super.deposit((int) (amount * (1 + interestRate)));
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    
}
