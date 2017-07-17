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
public class Question4 {
    public ArrayList<Point> getMainDiagonalPoints(ArrayList<Point> pointList) {
        ArrayList<Point> diagonalList = new ArrayList<>();
        for (Point point : pointList) {
            if (point.getX() == point.getY())
                diagonalList.add(point);
        }
        return diagonalList;
    }
}
