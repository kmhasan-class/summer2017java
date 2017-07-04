/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class Lab5 {

    public void printPersons(ArrayList<Person> personsList) {
        for (Person person : personsList) {
            System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
        }
    }
    
    public ArrayList<Person> listSeniors(ArrayList<Person> personsList) {
        ArrayList<Person> seniorsList = new ArrayList<>();
        for (Person person : personsList) {
            if (person.getAge() > 65)
                seniorsList.add(person);
        }
        return seniorsList;
    }
    
    public Lab5() {
        ArrayList<Person> personsList = new ArrayList<>();
        personsList.add(new Person("X", 67));
        personsList.add(new Person("Y", 70));
        personsList.add(new Person("Z", 45));
        personsList.add(new Person("AA", 32));
        personsList.add(new Person("RE", 99));
        personsList.add(new Person("XY", 14));
        personsList.add(new Person("ZZ", 63));
        personsList.add(new Person("JJ", 16));
        printPersons(listSeniors(personsList));
        
    }

    public static void main(String[] args) {
        Lab5 object = new Lab5();
    }
    
}
