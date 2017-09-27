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
    
    /**
     * Calculates and returns points for the home team
     * @return The points for the home team
     */
    public int getPointsForHomeTeam(){
        if (goalsShotByHomeTeam == goalsShotByGuestTeam) {
            return 1;
        }
        else if(goalsShotByHomeTeam >= goalsShotByGuestTeam){
            return 3;
        }
        return 0;
    }
    /**
     * Calculates and returns points for the guest team
     * @return The points for the guest team
     */
    public int getPointsForGuestTeam(){
        if (goalsShotByHomeTeam == goalsShotByGuestTeam) {
            return 1;
        }
        else if(goalsShotByHomeTeam <= goalsShotByGuestTeam){
            return 3;
        }
        return 0;
    }
    /**
     * 
     * @return The guest team(TeamClass) 
     */
    public Team getGuestTeam(){
        return guestTeam;
    }
    /**
     * 
     * @return The home team(TeamClass) 
     */
    public Team getHomeTeam(){
        return homeTeam;
    }
    /**
     * 
     * @return Goals that the home team received
     */
    public int getGoalsShotFromHomeTeam(){
        return goalsShotByHomeTeam;
    }
    /**
     * 
     * @return Goals that the guest team received
     */
    public int getGoalsShotFromGuestTeam(){
        return goalsShotByGuestTeam;
    }
}
