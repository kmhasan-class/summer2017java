/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes.demo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kmhasan
 */
public class Polygon extends Shape {
    private List<Vertex> vertexList;

    public Polygon() {
        super("Polygon");
        vertexList = new ArrayList<>();
    }
    
    @Override
    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < vertexList.size(); i++) {
            Vertex a = vertexList.get(i);
            Vertex b = vertexList.get((i + 1) % vertexList.size());
            double distance = a.getDistance(b);
            perimeter = perimeter + distance;
        }
        return perimeter;
    }

    @Override
    public double getArea() {
        // Try to implement the idea from:
        // http://mathworld.wolfram.com/PolygonArea.html
        return 0;
    }

    public void addVertex(Vertex v) {
        vertexList.add(v);
    }
    
    public void addVertices(Vertex[] array) {
        for (Vertex v : array)
            vertexList.add(v);
    }
}
