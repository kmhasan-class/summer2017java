/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kmhasan
 */
public class ShapesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Rectangle(10, 20));
        shapeList.add(new Rectangle(11, 20));
        shapeList.add(new Rectangle(10, 120));
        shapeList.add(new Rectangle(130, 20));
        shapeList.add(new Circle(10));
        shapeList.add(new Triangle(15, 20, 30));
        shapeList.add(new Circle(100));
        shapeList.add(new Circle(5));
        shapeList.add(new Circle(3));
        
        for (Shape s : shapeList) {
            System.out.println(s);
        }
        
        for (Shape s : shapeList) {
            if (s instanceof NameChanger)
                System.out.println(((NameChanger) s).changeName(s.getName()));
        }
        
        
        int numbers[] = {3, 4, 1, 2, 67, 3, 22, 1};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting:  " + Arrays.toString(numbers));

        float floats[] = {3.254f, 4.32f, 1.011f, 2, 67, 3, 22, 1};
        System.out.println("Before sorting: " + Arrays.toString(floats));
        Arrays.sort(floats);
        System.out.println("After sorting:  " + Arrays.toString(floats));
        
        String strings[] = {"banana", "apple", "blueberry", "jackfruit", "watermelon"};
        System.out.println("Before sorting: " + Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println("After sorting:  " + Arrays.toString(strings));
        
        /*
        ArrayList<String> stringList = new ArrayList<>();
        for (String s : strings)
            stringList.add(s);
        Collections.sort(stringList);
        */
        
        System.out.println("Before sorting: " + shapeList);
        Collections.sort(shapeList);
        System.out.println("After sorting:  " + shapeList);
        
    }
    
    // Homework: read ahead about Polymorphism
    
}
