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
public class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, String accountName, String address, double balance) {
        super(accountNumber, accountName, address, balance);
    }

    @Override
    public void withdraw(int amount) {
        super.withdraw(amount + 10);
    }
   
}
