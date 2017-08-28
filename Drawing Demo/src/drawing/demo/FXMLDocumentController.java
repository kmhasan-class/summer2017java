/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.demo;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {
    private double x;
    private double y;
    private int dirX;
    private int dirY;
    private double vX = 5;
    private double vY = 2;
    
    @FXML
    private Canvas drawingCanvas;

    private void drawingDemo() {
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();
        gc.setStroke(Color.RED);
        gc.strokeRect(10, 10, 30, 40);
        gc.setFill(Color.YELLOW);
        gc.setStroke(Color.GREEN);
        gc.fillRect(70, 30, 110, 50);
        gc.strokeRect(70, 30, 110, 50);
        gc.strokeOval(70, 30, 110, 50);

        for (double r = 200; r >= 20; r -= 5) {
            gc.strokeOval(320 - r, 240 - r, r * 2, r * 2);
        }

        gc.strokeLine(0, 0, 100, 300);
    }

    private void animationDemo() {
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();

        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1 / 30.0), event -> {
            gc.clearRect(0, 0, 640, 480);
            gc.setLineWidth(5);
            gc.strokeRect(0, 0, 640, 480);
            
            gc.setFill(Color.RED);
            gc.fillOval(10 + x, 10 + y, 30, 30);
            gc.strokeOval(10 + x, 10 + y, 30, 30);
            
            x = x + dirX * vX;
            y = y + dirY * vY;
            
            if (x > 640 - 35 || x < 0)
                dirX = -dirX;
            if (y > 480 - 35 || y < 0)
                dirY = -dirY;
        });

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }

    private void ballDemo() {
        List<Ball> ballList = new ArrayList<>();
        ballList.add(new Ball(50, 100, 20, 5, 2, 1, 1, Color.ALICEBLUE));
        ballList.add(new Ball(150, 50, 10, 2, 2, -1, 1, Color.PINK));
        ballList.add(new Ball(200, 350, 30, 1, 2, -1, 1, Color.ORANGE));
        ballList.add(new Ball(450, 50, 40, 3, 1, 1, -1, Color.LIGHTGRAY));
        ballList.add(new Ball(50, 30, 15, 5, 2, 1, 1, Color.BROWN));
        
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();
        Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1.0 / 30), event -> {
            gc.clearRect(0, 0, 640, 480);
            gc.strokeRect(0, 0, 640, 480);
            for (Ball ball : ballList) {
                gc.setFill(ball.getColor());
                gc.fillOval(ball.getCx() - ball.getRadius(), 
                        ball.getCy() - ball.getRadius(), 
                        ball.getRadius() * 2, 
                        ball.getRadius() * 2);
                gc.strokeOval(ball.getCx() - ball.getRadius(), 
                        ball.getCy() - ball.getRadius(), 
                        ball.getRadius() * 2, 
                        ball.getRadius() * 2);
                ball.updateLocation();
            }
            
            for (int i = 0; i < ballList.size(); i++)
                for (int j = i + 1; j < ballList.size(); j++)
                    if (ballList.get(i).isColliding(ballList.get(j)))
                        ballList.get(i).stopBall();
            // instead of stopping a ball,
            // swap the velocity vectors (vx, vy) of the two
            // colliding balls
        });
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        x = 0;
        y = 0;
        dirX = +1;
        dirY = +1;
        // drawingDemo();
        // animationDemo();
        ballDemo();
    }

}
