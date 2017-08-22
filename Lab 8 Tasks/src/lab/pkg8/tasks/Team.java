/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8.tasks;

/**
 *
 * @author kmhasan
 */
public class Team {
    private String teamName;
    private int gamesWon;
    private int gamesDrawn;
    private int gamesLost;
    private int goalsScored;
    private int goalsConceded;

    public Team(String teamName, int gamesWon, int gamesDrawn, int gamesLost, int goalsScored, int goalsConceded) {
        this.teamName = teamName;
        this.gamesWon = gamesWon;
        this.gamesDrawn = gamesDrawn;
        this.gamesLost = gamesLost;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesDrawn() {
        return gamesDrawn;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }
    
    public int getPoints() {
        return 3 * gamesWon + 1 * gamesDrawn + 0 * gamesLost;
    }
    
    public int getGoalDifference() {
        return goalsScored - goalsConceded;
    }

    @Override
    public String toString() {
        return "name: " + teamName + " points: " + getPoints() + " won: " + gamesWon + " diff: " + getGoalDifference();
    }
    
    
}
