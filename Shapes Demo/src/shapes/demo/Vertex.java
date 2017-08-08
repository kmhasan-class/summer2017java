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
class Vertex {
    private int x;
    private int y;

    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vertex() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Vertex{" + "x=" + x + ", y=" + y + '}';
    }
    
    // Vertex a = new Vertex(3, 2);
    // Vertex b = new Vertex(4, 2);
    // double distance = a.getDistance(b);
    
    public double getDistance(Vertex that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
