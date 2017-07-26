/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.gui.demo;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    @FXML
    private ListView<Student> listView;
    private ObservableList<Student> studentList;
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, Number> idColumn;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> dobColumn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        reset();
        studentList = FXCollections.observableArrayList();
        studentList.addAll(getStudentList());
        listView.setItems(studentList);
        studentTable.setItems(studentList);
        
        nameColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getName()));
        idColumn.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getId()));
        dobColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDateOfBirth().toString()));
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
    
    private boolean isValid() {
        // Homework: validate the user entries
        if (idField.getText() == null || idField.getText().length() == 0)
            return false;
        return true;
    }

    private ArrayList<Student> getStudentList() {
        ArrayList<Student> studentArrayList;
        studentArrayList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection
                (DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM student;";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date dob = resultSet.getDate("dob");
                LocalDate dateOfBirth = LocalDate.of(dob.getYear() + 1900,
                        Month.values()[dob.getMonth()], dob.getDate());
                Student student = new Student(id, name, dateOfBirth);
                studentArrayList.add(student);
            }
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
        return studentArrayList;
    }
    private void insertStudent(Student student) {
        int id = student.getId();
        String studentName = student.getName();
        LocalDate dob = student.getDateOfBirth();
        String query = "INSERT INTO student VALUES(" + id 
                + ", '" + studentName + "', '" + dob + "');";
        
        try {
            Connection connection = DriverManager.getConnection
                (DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            statusLabel.setText("Inserted student " + studentName);
            studentList.add(student);
            reset();
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }        
    }
    
    @FXML
    private void handleSubmitAction(ActionEvent event) {
        if (!isValid()) {
            return;
        }
        
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        LocalDate dob = dobPicker.getValue();
        
        Student student = new Student(id, name, dob);
        insertStudent(student);
    }

    @FXML
    private void handleStudentClickAction(MouseEvent event) {
        Student student = listView.getSelectionModel().getSelectedItem();
        idField.setText(student.getId() + "");
        nameField.setText(student.getName());
        dobPicker.setValue(student.getDateOfBirth());
    }
    
}
