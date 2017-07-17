/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.materials;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private DatePicker datePicker;
    @FXML
    private ComboBox<String> comboBox;
    private ObservableList<String> dataList;
    @FXML
    private ListView<String> listView;
    @FXML
    private TextField colorField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LocalDate localDate = LocalDate.now();
        datePicker.setValue(localDate);
        
        dataList = FXCollections.observableArrayList();
        dataList.add("ORANGE");
        dataList.add("GREEN");
        dataList.add("YELLOW");
        
        comboBox.setItems(dataList);
        listView.setItems(dataList);
    }

    @FXML
    private void handleDatePickerAction(ActionEvent event) {
        LocalDate localDate = datePicker.getValue();
        System.out.println(localDate.toString());
        System.out.println(localDate.getMonth());
    }

    @FXML
    private void handleSetDateAction(ActionEvent event) {
        LocalDate localDate = LocalDate.of(1952, Month.FEBRUARY, 21);
        datePicker.setValue(localDate);
    }
    
    // Homework: use SimpleDateFormatter to change the format from default: MM/DD/YYYY

    @FXML
    private void handleAddColorAction(ActionEvent event) {
        dataList.add(colorField.getText());
    }

    @FXML
    private void handleColorSelection(ActionEvent event) {
        String selectedItem = comboBox.getSelectionModel().getSelectedItem();
        int selectedIndex = comboBox.getSelectionModel().getSelectedIndex();
        System.out.println(selectedItem + " " + selectedIndex);
    }

    @FXML
    private void handleOpenReportAction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Report.fxml"));
        
        Scene scene = new Scene(root);
    
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
}
