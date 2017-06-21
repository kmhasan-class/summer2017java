/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.demo.with.fraction;

/**
 *
 * @author kmhasan
 */
public class OOPDemoWithFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction number1 = new Fraction(1, 3);
        Fraction number2 = new Fraction(2, 3);
        Fraction number3 = number1.add(number2);
        number1.print();
        number2.print();
        number3.print();
    }
    
}
