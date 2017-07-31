/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum.demo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class EnumDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Month month = Month.MAR;
        
        if (month == Month.MAR)
            System.out.println("This is March");
        else System.out.println("Not March");
        
        switch (month) {
            case JAN:
                System.out.println("January is not March");
                break;
            case MAR:
                System.out.println("This is March");
                break;
        }
        
        for (Month m : Month.values())
            System.out.println(m);
        
        ArrayList<ExamRecord> recordList = new ArrayList<>();
        recordList.add(new ExamRecord("12", "CSE2015", Grade.A_PLUS));
        recordList.add(new ExamRecord("12", "CSE2016", Grade.A_MINUS));

        double sum = 0;
        for (ExamRecord r : recordList)
            sum = sum + r.getGrade().getNumericGrade();
        System.out.println("Sum of numeric grades: " + sum);
    }
    
}
