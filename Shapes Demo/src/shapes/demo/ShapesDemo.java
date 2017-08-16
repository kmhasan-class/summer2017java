/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author kmhasan
 */
public class ShapesDemo {

    // Inner class
    class NameComparator implements Comparator<Shape> {

        @Override
        public int compare(Shape o1, Shape o2) {
//            if (o1.getName().compareTo(o2.getName()) < 0) {
//                return -1;
//            } else if (o1.getName().compareTo(o2.getName()) > 0) {
//                return +1;
//            } else return 0;
//            
            return o1.getName().compareTo(o2.getName());
        }
    }

    public ShapesDemo() {
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
            if (s instanceof NameChanger) {
                System.out.println(((NameChanger) s).changeName(s.getName()));
            }
        }

        int numbers[] = {3, 4, 1, 2, 67, 3, 22, 1};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        Arrays.sort(numbers); // sorts in ascending (smallest to largest) order
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
        //Collections.sort(shapeList, new AreaComparator());
        //Collections.sort(shapeList, new NameComparator());
        //Anonymous inner class
        Collections.sort(shapeList, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                if (o1.getArea() < o2.getArea()) {
                    return -1;
                } else if (o1.getArea() > o2.getArea()) {
                    return +1;
                }
                return 0;
            }
        });
        
        // lambda expression
        Collections.sort(shapeList, 
                (s1, s2) -> s1.getName().compareTo(s2.getName()));
        // Homework: implement new Comparators for Shape
        // Compare by perimeter
        // Compare by name
        // Challenge: Compare by name first then by area
        
        Collections.sort(shapeList, 
                (s1, s2) -> {
                    if (s1.getPerimeter() < s2.getPerimeter())
                        return -1;
                    else if (s1.getPerimeter() > s2.getPerimeter())
                        return +1;
                    else return 0;
                });
        System.out.println("After sorting:  " + shapeList);

        Polygon polygon = new Polygon();
        polygon.addVertex(new Vertex(0, 0));
        polygon.addVertex(new Vertex(1, 0));
        polygon.addVertex(new Vertex(1, 1));
        polygon.addVertex(new Vertex(0, 1));
        System.out.println(polygon);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(30);
        intList.add(2);
        intList.add(6);
        intList.add(4);
        intList.add(1);
        System.out.println("Before sorting: " + intList);
        Collections.sort(intList, new IntegerReverseComparator());
        System.out.println("After sorting:  " + intList);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapesDemo shapesDemo = new ShapesDemo();
    }

    // Homework: read ahead about Polymorphism
}
