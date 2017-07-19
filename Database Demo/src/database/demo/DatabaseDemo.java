/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmhasan
 */
public class DatabaseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Abul", LocalDate.of(1988, Month.DECEMBER, 28)));
        studentList.add(new Student(2, "Babul", LocalDate.of(1989, Month.APRIL, 28)));
        studentList.add(new Student(3, "Kabul", LocalDate.of(1932, Month.DECEMBER, 28)));
        studentList.add(new Student(4, "Putul", LocalDate.of(1945, Month.MAY, 28)));
        studentList.add(new Student(5, "Ratul", LocalDate.of(1966, Month.DECEMBER, 28)));

        try {
            RandomAccessFile output = new RandomAccessFile("students.txt", "rw");
            for (Student student : studentList) {
                output.writeBytes(student + "\n");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DatabaseDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DatabaseDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
