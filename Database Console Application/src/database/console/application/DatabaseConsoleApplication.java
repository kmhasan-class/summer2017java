/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.console.application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author kmhasan
 */
public class DatabaseConsoleApplication {
    private final String DB_USERNAME = "summer2017java";
    private final String DB_PASSWORD = "java";
    private final String DB_HOSTNAME = "172.17.0.134";
    private final String DB_DBNAME = "studentdb";
    private final String DB_URL = "jdbc:mysql://" + DB_HOSTNAME + "/" + DB_DBNAME;
    
    public void insertData() {
        int id = 99;
        String studentName = "Jane Doe";
        LocalDate dob = LocalDate.of(1985, Month.FEBRUARY, 22);
        String query = "insert into student values(" + id + ", '" + studentName + "', '" + dob + "');";
        
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }
    
    public void retrieveData() {
        String query = "select * from student;";
        
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date date = resultSet.getDate("dob");
                System.out.println(id + " " + name + " " + date);
            }
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }        
    }
    
    public DatabaseConsoleApplication() {
        //insertData();
        retrieveData();
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new DatabaseConsoleApplication();
    }
    
}
