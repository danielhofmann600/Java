/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emqualification;

/**
 *
 * @author if150109
 */
public class Team implements Comparable<Team>{

    public Team(String name) {
        this.name = name;
        wins = 0;
        draws = 0;
        defeats = 0;
        goalsShot = 0;
        goalsReceived = 0;
    }
    private String name;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsShot;
    private int goalsReceived;
    
    /** updateTeamState ist in addGame integriert! **/
    public void addGame(Game game){
        if(game.getGuestTeam().name == name){
            if(game.getPointsForGuestTeam() == 3)wins++;
            if(game.getPointsForGuestTeam() == 1)draws++;
            if(game.getPointsForGuestTeam() == 0)defeats++;
            goalsShot += game.getGoalsShotFromGuestTeam();
            goalsReceived += game.getGoalsShotFromHomeTeam();
        }
        else{
            if(game.getPointsForHomeTeam() == 0)wins++;
            if(game.getPointsForHomeTeam() == 1)draws++;
            if(game.getPointsForHomeTeam() == 3)defeats++;
            goalsShot += game.getGoalsShotFromHomeTeam();
            goalsReceived += game.getGoalsShotFromGuestTeam();
        }
        return;
    }
    
    public int getPoints(){
        return wins * 3 + draws;
    }
    
    public int getGoalDifference(){
        return goalsShot - goalsReceived;
    }
    
    public String getName(){
        return name;
    }
    
    public int getWins(){
        return wins;
    }
    
    public int getDraws(){
        return draws;
    }
    
    public int getDefeats(){
        return defeats;
    }
    
    public int getGoalsShot(){
        return goalsShot;
    }
    
    public int getGoalsReceived(){
        return goalsReceived;
    }

    @Override
    public int compareTo(Team o) {
        if(this.getPoints() > o.getPoints())return 1;
        if(this.getPoints() < o.getPoints())return -1;
        return 0;
    }
}
