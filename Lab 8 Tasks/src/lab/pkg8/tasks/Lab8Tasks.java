/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kmhasan
 */

/*
Lab tasks
- Create a class to represent football teams. You need to store the team name, number of games played, number of games won, number of games drawn and number of games lost.
- Use lambda expressions to sort the teams by the points (3 for winning, 1 for drawing, 0 for losing) first, then by number of matches won, then by goal difference and finally by goals scored.
- Use streams to find out the average points scored by teams.
- Use streams to find out the team with the highest goals scored.
*/

public class Lab8Tasks {

    public Lab8Tasks() {
        List<Team> teamList = new ArrayList<>();
        teamList.add(new Team("Real Madrid", 10, 3, 2, 10, 5));
        teamList.add(new Team("Valencia", 0, 5, 10, 25, 20));
        teamList.add(new Team("Granada", 0, 5, 10, 25, 15));
        teamList.add(new Team("Real Betis", 1, 2, 12, 10, 15));
        teamList.add(new Team("Barcelona", 11, 2, 2, 20, 7));
        
        System.out.println("Before sorting");
        teamList.forEach(System.out::println);

        teamList = teamList
                .stream()
                .sorted(
                        Comparator.comparing(Team::getPoints)
                        .thenComparing(Team::getGamesWon)
                        .thenComparing(Team::getGoalDifference)
                                .reversed()
                )
                .collect(Collectors.toList());
        
        System.out.println("\nAfter sorting");
        teamList.forEach(System.out::println);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Lab8Tasks();
    }
    
}
