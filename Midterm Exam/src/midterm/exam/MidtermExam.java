/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.exam;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class MidtermExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.appendString("output.txt", "Hello");
        q3.appendString("output.txt", "World");
        
        Question4 q4 = new Question4();
        ArrayList<Point> pointList = new ArrayList<>();
        pointList.add(new Point(3, 3));
        pointList.add(new Point(3, 5));
        pointList.add(new Point(1, 1));
        pointList.add(new Point(-5, -5));
        ArrayList<Point> diagonalPoints = q4.getMainDiagonalPoints(pointList);
        for (Point point: diagonalPoints)
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
    }
    
}
