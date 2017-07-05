/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.io.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


/**
 *
 * @author kmhasan
 */
public class FileIODemo {

    public void write() {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the line you want to save to the file");
                String message = scanner.nextLine();
                if (message.equals("DONE"))
                    break;
                RandomAccessFile output = new RandomAccessFile("data.txt", "rw");
                long existingLength = output.length();
                output.seek(existingLength);
                output.writeBytes(message + "\n");
            }
            
        } catch (FileNotFoundException fnfe) {
            System.err.println("data.txt file is missing!");
        } catch (IOException ioe) {
            System.err.println("Cannot write to data.txt file!");
        }
        
    }
    
    public void read() {
        try {
            RandomAccessFile input = new RandomAccessFile("data.txt", "r");
            while (true) {
                String line = input.readLine();
                if (line == null)
                    break;
                System.out.println("READ: [" + line + "]");
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("data.txt file is missing!");
        } catch (IOException ioe) {
            System.err.println("Cannot write to data.txt file!");
        }
    }
    
    public FileIODemo() {
        //write();
        read();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileIODemo object = new FileIODemo();
    }
    
}
