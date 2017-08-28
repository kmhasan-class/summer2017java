/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.demo;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 *
 * @author kmhasan
 */
public class Ball {

    private double cx;
    private double cy;
    private double radius;
    private double vX;
    private double vY;
    private double dirX;
    private double dirY;
    private Color color;
    
    public Ball(double cx, double cy, double radius, double vX, double vY, double dirX, double dirY, Color color) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        this.vX = vX;
        this.vY = vY;
        this.dirX = dirX;
        this.dirY = dirY;
        this.color = color;
    }

    public void updateLocation() {
        cx = cx + dirX * vX;
        cy = cy + dirY * vY;

        if (cx > 640 - radius || cx < 0) {
            dirX = -dirX;
        }
        if (cy > 480 - radius || cy < 0) {
            dirY = -dirY;
        }
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public boolean isColliding(Ball b) {
        Ball a = this;
        double dx = a.getCx() - b.getCx();
        double dy = a.getCy() - b.getCy();
        double distance = Math.sqrt(dx * dx + dy * dy);
        double radiusSum = a.getRadius() + b.getRadius();
        if (distance <= radiusSum)
            return true;
        else return false;
    }
    
    public void stopBall() {
        vX = 0;
        vY = 0;
    }
}
