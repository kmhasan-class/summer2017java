/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.demo;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //int x[] = new int[5];
        int x[];
        x = new int[10];
        x[3] = 4;
        x[2] = x[0] + x[1];
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);
        
        x = new int[5];
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);
        
        */
        
        ArrayList<Integer> x;
        x = new ArrayList<Integer>();
        x.add(10);
        x.add(35);
        x.add(20);
        x.remove(1);
        x.set(0, 11);
        for (int i = 0; i < x.size(); i++)
            System.out.println(x.get(i));
        if (x.contains(30))
            System.out.println("Found 30!");
        else System.out.println("30 is missing!");
        
        ArrayList<String> s = new ArrayList<>();
        s.add("Abul");
        s.add("Babul");
        s.add("Ratul");
        s.add("Putul");
        s.add("Tetul");
        s.add("Tutul");
        s.add("Kabul");
        s.remove(2);
        for (int i = 0; i < s.size(); i++)
            System.out.println(s.get(i));
        
        System.out.println(s.indexOf("Tetul"));
        
        // Enhanced for loop
        for (String myString : s)
            System.out.println(myString);
        
        // using Lambdas (streams)
        s.forEach(System.out::println);
    }
    
    /*
    Homework:
    Write a program that creates an ArrayList with the following
    numbers: {15.2, 4.56, 2, 4, 5, 3.22, 6.78}
    Write an enhnaced for loop to calculate the average of all
    those numbers
    */
    
    /*
    Homework:
    Read chapter 3, 5 from HFJ and more importantly chapter 7
    from JHTP
    */
    
}
