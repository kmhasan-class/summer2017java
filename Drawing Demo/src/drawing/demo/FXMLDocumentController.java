/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Canvas drawingCanvas;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();
        gc.strokeRect(10, 10, 30, 40);
        gc.fillRect(70, 30, 110, 50);
    }    
    
}
