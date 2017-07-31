/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum.demo;

/**
 *
 * @author kmhasan
 */
public enum Grade {
    A_PLUS ("A+", 4.00),
    A ("A", 3.75),
    A_MINUS ("A-", 3.50),
    B_PLUS ("B+", 3.25),
    B ("B", 3.00),
    F ("F", 0.00);

    private Grade(String letterGrade, double numericGrade) {
        this.letterGrade = letterGrade;
        this.numericGrade = numericGrade;
    }
    
    private String letterGrade;
    private double numericGrade;

    public String getLetterGrade() {
        return letterGrade;
    }

    public double getNumericGrade() {
        return numericGrade;
    }
}
