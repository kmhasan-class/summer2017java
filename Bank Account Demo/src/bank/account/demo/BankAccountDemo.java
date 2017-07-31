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
public class BankAccountDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount
            (420, "Md. Rakibul Hasan", "AR Tower 903", 500);
        bankAccount.deposit(100);
        bankAccount.withdraw(400);
        System.out.println(bankAccount);
    }
    
}
