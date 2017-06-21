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
    private double x;
    private double y;
    
    public Point(double px, double py) {
        x = px;
        y = py;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void translate(double tx, double ty) {
        x = x + tx;
        y = y + ty;
    }
    
    // use the formulas from
    // https://www.tutorialspoint.com/computer_graphics/2d_transformation.htm
    // to implement rotate and scale
    
    public void rotate(double angle) {
        // angle is given in degrees
        // in Math class of Java all the angle related calculations
        // are in radians
        double x0 = x;
        double y0 = y;
        double theta = Math.toRadians(angle);
        
        x = x0 * Math.cos(theta) - y0 * Math.sin(theta);
        y = x0 * Math.sin(theta) + y0 * Math.cos(theta);
    }
    
    public void scale(double sx, double sy) {
        x = x * sx;
        y = y * sy;
    }
}
