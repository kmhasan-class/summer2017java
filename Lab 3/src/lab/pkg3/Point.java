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
public class Point {
    double x;
    double y;
    
    Point(double px, double py) {
        x = px;
        y = py;
    }
    
    void translate(double tx, double ty) {
        x = x + tx;
        y = y + ty;
    }
    
    // use the formulas from
    // https://www.tutorialspoint.com/computer_graphics/2d_transformation.htm
    // to implement rotate and scale
    
    void rotate(double angle) {
        // angle is given in degrees
        // in Math class of Java all the angle related calculations
        // are in radians
    }
    
    void scale(double sx, double sy) {
        
    }
}
