/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author kmhasan
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.printf("I am %d years old.\n", 38);
        
        /*
        Task 1:
        Declare two integer variables, x and y.
        Put the minimum of those two variables in a third variable z.
        Print the value of z.
        */
        int x = 10;
        int y = 25;
        int z;
        if (x < y)
            z = x;
        else z = y;
        System.out.printf("Minimum: %d\n", z);
        
        /*
        Task 2:
        Solve the same problem using Math.min method. 
        Math.min(x, y) should return the minimum value.
        */
        z = Math.min(x, y);
        System.out.printf("Minimum: %d\n", z);
        
        /*
        Task 3:
        There are many useful methods in the Math class.
        You can search for "Java Math API" to look at the
        documentation.
        https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
        Look up the documentation to see how you can compute,
        a) exponentiation
        b) square root
        Calculate and print the value of 2^10 
        and square root of 450. Also, print the value of x where
        int x = 2 ^ 10;
        */
        double power = Math.pow(2, 10);
        double squareRoot = Math.sqrt(450);
        System.out.printf("Power: %8.0f\n", power);
        System.out.printf("Square Root: %f\n", squareRoot);
        x = 2 ^ 10; 
        // 2  = 0010 (in binary)
        // 10 = 1010 (in binary)
        // ------------- XOR (exclusive OR)
        // 8  = 1000
        System.out.printf("Power: %d\n", x);
        
        /*
        Task 4:
        Find the smallest element from an array
        */
        int data[] = {5, 1, 5, 2, 3, 6, 7, 2};
        /*
        min = 10000;
        i | data[i] | min
        ------------------
        0 | 5       | 5
        1 | 1       | 1
        2 | 5       | 1
        3 | 2       | 1
        ...
        
        data.length gives you the number of elements in the
        array
        
        for (int i = 0; i < data.length; i++)
        ...
        
        What should we really use for the initial minimum?
        */
        
    }
    
}
