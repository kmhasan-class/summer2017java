/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    int num1;
    int num2;
    String operation;

    @FXML
    private TextField displayField;
    @FXML
    private Button digitZeroButton;
    @FXML
    private Button dotButton;
    @FXML
    private Button digitOneButton;
    @FXML
    private Button digitTwoButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        displayField.requestFocus();
    }

    @FXML
    private void handleDigitOneAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "1";

        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDigitTwoAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "2";

        displayField.setText(newText);
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleDotAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText;
        
        if (!oldText.contains(".")) {
            newText = oldText + ".";
            displayField.setText(newText);
        }
        
        displayField.requestFocus();
        displayField.positionCaret(newText.length());
    }

    @FXML
    private void handleAdditionAction(ActionEvent event) {
        num1 = Integer.parseInt(displayField.getText());
        displayField.clear();
        operation = "ADD";
    }

    @FXML
    private void handleSubtractionAction(ActionEvent event) {
        num1 = Integer.parseInt(displayField.getText());
        displayField.clear();
        operation = "SUB";
    }

    @FXML
    private void handleEqualsAction(ActionEvent event) {
        num2 = Integer.parseInt(displayField.getText());
        int result = 0;
        if (operation.equals("ADD")) {
            result = num1 + num2;
        } else if (operation.equals("SUB")) {
            result = num1 - num2;
        }
        displayField.setText("" + result);
    }
    
    /*
    Homeworks:
    1. add all the digits and write code for them
    2. add operations for * and /
    3. make sure that you do not have leading zeroes unless
    that leading zero is followed by a dot. Hint: use 
    startsWith() method in String class
        String a = "Hello";
        a.startsWith("Hell") -> returns true
        a.startsWith("ell") -> returns false
        a.contains("ell") -> returns true
    4. make sure your code handles chaining of operations
    for example, 10+2+3-4= should give you 11

    */
}
