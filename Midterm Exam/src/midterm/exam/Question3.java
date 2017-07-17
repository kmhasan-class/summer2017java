/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.exam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author kmhasan
 */
public class Question3 {
    public void appendString(String filename, String string) {
        try {
            RandomAccessFile output = new RandomAccessFile(filename, "rw");
            output.seek(output.length());
            output.writeBytes(string);
        } catch (FileNotFoundException fnfe) {
            System.err.println("File not found");
        } catch (IOException ioe) {
            System.err.println("Some IOE");
        }
    }
}
