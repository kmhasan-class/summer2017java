/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes.demo;

/**
 *
 * @author kmhasan
 */
public class ShapesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Shape s = new Shape("Whatever shape");
        Rectangle r = new Rectangle(10, 20);
        Circle c = new Circle(10);
//        System.out.println(s);
        System.out.println(r);
        System.out.println(c);
    }
    
    // Homework: read ahead about Polymorphism
    
}
