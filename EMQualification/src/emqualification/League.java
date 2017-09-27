/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emqualification;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author if150109
 */
class League {

    LinkedList<Team> teamTable;
    
    
    public League() {
        teamTable = new LinkedList<>();
    }

    void addGameResult(String homeTeamName, String guestTeamName, int goalsShotByHomeTeam, int goalsShotByGuestTeam) {
        Team homeTeam = new Team(homeTeamName);
        Team guestTeam = new Team(guestTeamName);
        for(Team team : teamTable){
            if(team.getName().compareTo(homeTeam.getName())== 1){
                break;
            }
            else{
                teamTable.add(homeTeam);
            }
        }
        for(Team team : teamTable){
            if(team.getName().compareTo(guestTeam.getName())== 1){
                break;
            }
            else{
                teamTable.add(guestTeam);
            }
        }
        if(teamTable.isEmpty()){
            teamTable.add(homeTeam);
            teamTable.add(guestTeam);
        }
        Game actualGame;
        actualGame = new Game(homeTeam,guestTeam,goalsShotByHomeTeam,goalsShotByGuestTeam);
        homeTeam.addGame(actualGame);
        actualGame = new Game(guestTeam,homeTeam,goalsShotByGuestTeam,goalsShotByHomeTeam);
        guestTeam.addGame(actualGame);
    }
    Team getTeam(String teamName){
        for(Team team : teamTable){
            if(team.getName().compareTo(teamName) == 1){
                return team;
            }
        }
        return null;
    }
    List<Team> getResultTable(){
        return teamTable;
    }
    
    
}