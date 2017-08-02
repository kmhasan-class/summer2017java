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
        SavingsAccount s = new SavingsAccount
            (420, "Md. Rakibul Hasan", "AR Tower 903", 500, 12.0/100.0);
        s.deposit(100);
        s.withdraw(400);
        System.out.println(s);
        
        BankAccount b = new BankAccount(1, "John Doe", "Nowhere", 100);
        b.deposit(100);
        System.out.println(b);
        
        CurrentAccount c = new CurrentAccount(5, "Jane Doe", "Somewhere", 500);
        c.deposit(100);
        c.withdraw(100);
        System.out.println(c);
    }
    
}
