/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.demo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author kmhasan
 */
public class Student {
    private int id;
    private String name;
    private double cgpa;
    private String address;
    private String phone;
    private LocalDate dateOfBirth;
    
    Student() {
        
    }
    
    Student(int id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(int id, String name, double cgpa, String address, String phone, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.address = address;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public long calculateAge() {
        LocalDate todaysDate = LocalDate.now();
        return DAYS.between(dateOfBirth, todaysDate);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", address=" + address + ", phone=" + phone + ", dateOfBirth=" + dateOfBirth + '}';
    }
}
