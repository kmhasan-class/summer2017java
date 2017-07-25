/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.gui.demo;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {
    private final String DB_USERNAME = "summer2017java";
    private final String DB_PASSWORD = "java";
    private final String DB_HOSTNAME = "172.17.0.134";
    private final String DB_DBNAME = "studentdb";
    private final String DB_URL = "jdbc:mysql://" + DB_HOSTNAME + "/" + DB_DBNAME;
    
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private DatePicker dobPicker;
    @FXML
    private Label statusLabel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        reset();
    }    

    @FXML
    private void handleResetAction(ActionEvent event) {
        reset();
    }

    private void reset() {
        idField.clear();
        nameField.clear();
        dobPicker.setValue(LocalDate.now());
    }
    
    boolean isValid() {
        // Homework: validate the user entries
        if (idField.getText() == null || idField.getText().length() == 0)
            return false;
        return true;
    }
    
    private void insertStudent(Student student) {
        int id = student.getId();
        String studentName = student.getName();
        LocalDate dob = student.getDateOfBirth();
        String query = "insert into student values(" + id 
                + ", '" + studentName + "', '" + dob + "');";
        
        if (!isValid()) {
            return;
        }
        
        try {
            Connection connection = DriverManager.getConnection
                (DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            statusLabel.setText("Inserted student " + studentName);
            reset();
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }        
    }
    
    @FXML
    private void handleSubmitAction(ActionEvent event) {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        LocalDate dob = dobPicker.getValue();
        
        Student student = new Student(id, name, dob);
        insertStudent(student);
    }
    
}
