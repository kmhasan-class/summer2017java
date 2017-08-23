/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.demo;

import java.net.URL;
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
            
            x = x + dirX * 5;
            y = y + dirY * 2;
            
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        x = 0;
        y = 0;
        dirX = +1;
        dirY = +1;
        //drawingDemo();
        animationDemo();
    }

}
