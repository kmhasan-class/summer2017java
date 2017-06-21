/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;

/**
 *
 * @author kmhasan
 */
public class Lab3 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        p1.translate(2, 3);
        System.out.println(p1.getX() + ", " + p1.getY());
        
        // apply rotate by 45 degrees and scale by 2 in both
        // x and y axis on point p1.
        p1.rotate(45);
        
        // declare a new point p2 at 30, 40
        // apply -30 degrees rotation on point p2
        
        // add a new method in point class that
        // finds the distance between two points
        // use that method to find the distance between
        // p1 and p2
    }
    
}
