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
public abstract class Shape {
    private String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }
    
    public abstract double getPerimeter();
    
    public abstract double getArea();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", A: " + getArea() + ", P: " + getPerimeter();
    }
    
}
