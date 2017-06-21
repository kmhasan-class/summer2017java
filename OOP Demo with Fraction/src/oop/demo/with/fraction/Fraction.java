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
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }
    
    public Fraction multiply(Fraction b) {
        Fraction a = this;
        int numerator = a.numerator * b.numerator;
        int denominator = a.denominator * b.denominator;
        Fraction c = new Fraction(numerator, denominator);
        return c;
    }
    
    public Fraction add(Fraction b) {
        Fraction a = this;
        int numerator = a.numerator * b.denominator + a.denominator * b.numerator;
        int denominator = a.denominator * b.denominator;
        Fraction c = new Fraction(numerator, denominator);
        return c;
    }
    
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
}
