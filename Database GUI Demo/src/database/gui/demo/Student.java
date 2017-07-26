/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.gui.demo;

import java.time.LocalDate;

/**
 *
 * @author kmhasan
 */
public class Student {
    private int id;
    private String name;
    private LocalDate dateOfBirth;

    public Student() {
    }

    public Student(int id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return name;
        //return "Student{" + "id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + '}';
    }
    
    
}
