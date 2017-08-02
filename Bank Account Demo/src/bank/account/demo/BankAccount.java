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
public class BankAccount {
    private int accountNumber;
    private String accountName;
    private String address;
    private double balance;

    public BankAccount(int accountNumber, String accountName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.address = address;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance)
            balance = balance - amount;
    }

    public void deposit(int amount) {
        if (amount > 0)
            balance = balance + amount;
    }
//    
//    @Override
//    public String toString() {
//        return "BankAccount{" + "accountNumber=" + accountNumber + ", accountName=" + accountName + ", address=" + address + ", balance=" + balance + '}';
//    }
//    

    @Override
    public String toString() {
        return getAccountName() + " - " + getBalance();
    }
}
