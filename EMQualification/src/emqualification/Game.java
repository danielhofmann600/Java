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
public class Game {

    public Game(Team homeTeam, Team guestTeam, int goalsShotByHomeTeam, int goalsShotByGuestTeam) {
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.goalsShotByHomeTeam = goalsShotByHomeTeam;
        this.goalsShotByGuestTeam = goalsShotByGuestTeam;
    }
    Team homeTeam;
    Team guestTeam;
    private int goalsShotByHomeTeam;
    private int goalsShotByGuestTeam;
    
    public int getPointsForHomeTeam(){
        if (goalsShotByHomeTeam == goalsShotByGuestTeam) {
            return 1;
        }
        else if(goalsShotByHomeTeam >= goalsShotByGuestTeam){
            return 3;
        }
        return 0;
    }
    public int getPointsForGuestTeam(){
        if (goalsShotByHomeTeam == goalsShotByGuestTeam) {
            return 1;
        }
        else if(goalsShotByHomeTeam <= goalsShotByGuestTeam){
            return 3;
        }
        return 0;
    }
    public Team getGuestTeam(){
        return guestTeam;
    }
    
    public Team getHomeTeam(){
        return homeTeam;
    }
    
    public int getGoalsShotFromHomeTeam(){
        return goalsShotByHomeTeam;
    }
    
    public int getGoalsShotFromGuestTeam(){
        return goalsShotByGuestTeam;
    }
}
