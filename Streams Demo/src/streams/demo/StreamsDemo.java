/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kmhasan
 */
public class StreamsDemo {

    private List<Person> getListOfPeopleLessThan30YearsOld(List<Person> personList) {
        /*
        List<Person> newList = new ArrayList<>();
        for (Person p : personList)
            if (p.getAge() < 30)
                newList.add(p);
        return newList;
        */
        return personList
                .stream()
                .filter(person -> person.getAge() < 30)
                .collect(Collectors.toList());
    }
    
    private double getAgeSum(List<Person> personList) {
        /*
        double sum = 0;
        for (Person p : personList)
            sum = sum + p.getAge();
        return sum;
        */
        
        return personList
                .stream()
                .filter(person -> person.getAge() < 30)
                .mapToDouble(person -> person.getAge())
                .sum();
    }
    
    // Homework:
    // 1. Use streams API to find out the min/max age
    // 2. Find out the longest name holding person
    
    public StreamsDemo() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(5, "John Doe", 14));
        personList.add(new Person(7, "Jane Doe", 53));
        personList.add(new Person(1, "Abul", 42));
        personList.add(new Person(2, "Babul", 21));
        personList.add(new Person(15, "Abul", 22));
        personList.add(new Person(4, "Ratul", 22));
        personList.add(new Person(3, "Putul", 67));
        personList.add(new Person(10, "Abul", 14));
        /*
        for (int i = 0; i < personList.size(); i++)
            System.out.println(personList.get(i));
        
        for (Person person : personList)
            System.out.println(person);
        */
        //personList.stream().forEach(person -> System.out.println(person));
        personList.stream().forEach(Person::increaseAge);
//        for (Person person : personList)
//            person.increaseAge();

        personList.stream().forEach(System.out::println);
        
        //printing persons who are > 50 years old
        System.out.println("\nPrinting persons > 50 years old with enhanced for loop");
        for (Person person : personList)
            if (person.getAge() > 50)
                System.out.println(person);
        
        System.out.println("\nPrinting persons > 50 years old with streams and lambda");
        personList.stream()
                .filter(person -> person.getAge() > 50)
                .forEach(System.out::println);

        //printing persons who are > 50 years old -- names in uppercase
        System.out.println("\nPrinting persons > 50 years old with enhanced for loop -- names in uppercase");
        for (Person person : personList)
            if (person.getAge() > 50)
                System.out.println(person.getName().toUpperCase());
        
        System.out.println("\nPrinting persons > 50 years old with streams and lambda -- names in uppercase");
        personList.stream()
                .filter(person -> person.getAge() > 50)
                .map(person -> person.getName().toUpperCase())
                .forEach(System.out::println);

        //printing persons who are > 50 years old and their names end with "ul"
        System.out.println("\nPrinting persons > 50 years old and their names end with ul with enhanced for loop");
        for (Person person : personList)
            if (person.getAge() > 50 && person.getName().endsWith("ul"))
                System.out.println(person);

        System.out.println("\nPrinting persons > 50 years old and their names end with ul with streams and lambda");
        personList.stream()
                .filter(person -> person.getAge() > 50)
                .filter(person -> person.getName().endsWith("ul"))
                .forEach(System.out::println);        
        
        // sort the person list based on age
        System.out.println("\nSorted by age using lambda expressions");
//        Collections.sort(personList, (p1, p2) -> {
//           if (p1.getAge() < p2.getAge()) 
//               return -1;
//           else if (p1.getAge() > p2.getAge()) 
//               return +1;
//           else return 0;
//        });
//        personList.stream().forEach(System.out::println);
        
        personList
                .stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);
        /*
        Collections.sort(personList, (p1, p2) -> {
            if (p1.getName().compareTo(p2.getName()) == 0) {
                if (p1.getAge() < p2.getAge())
                    return -1;
                else if (p1.getAge() > p2.getAge())
                    return +1;
                else return 0;
            } else return p1.getName().compareTo(p2.getName());
        });
        */
        System.out.println("\nSorted by name and then age using lambda expressions");
        personList
                .stream()
                .sorted(Comparator
                        .comparing(Person::getAge)
                        .thenComparing(Person::getName)
                    )
                .forEach(System.out::println);
        //personList.stream().forEach(System.out::println);
        
        System.out.println("\nList of people who are less than 30 years old");
        getListOfPeopleLessThan30YearsOld(personList).forEach(System.out::println);
        
        System.out.println("\nSum of all the ages: " + getAgeSum(personList));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new StreamsDemo();
    }
    
}
