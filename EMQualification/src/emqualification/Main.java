package emqualification;

import java.io.PrintStream;
import java.util.List;

/**
 * Main adding all game results known so far, then getting the sorted league
 * table and finally printing this table.
 *
 * @author 3xHDV
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        League euroQualifying2016GoupG = new League();
        addGames(euroQualifying2016GoupG);
        List<Team> resultTable = euroQualifying2016GoupG.getResultTable();
        printResultTable(resultTable);
    }

    private static void addGames(League euroQualification2016) {
        euroQualification2016.addGameResult("Russland", "Liechtenstein", 4, 0);
        euroQualification2016.addGameResult("Montenegro", "Moldau", 2, 0);
        euroQualification2016.addGameResult("Oesterreich", "Schweden", 1, 1);
        euroQualification2016.addGameResult("Liechtenstein", "Montenegro", 0, 0);
        euroQualification2016.addGameResult("Moldau", "Oesterreich", 1, 2);
        euroQualification2016.addGameResult("Schweden", "Russland", 1, 1);
        euroQualification2016.addGameResult("Russland", "Moldau", 1, 1);
        euroQualification2016.addGameResult("Oesterreich", "Montenegro", 1, 0);
        euroQualification2016.addGameResult("Schweden", "Liechtenstein", 2, 0);
        euroQualification2016.addGameResult("Moldau", "Liechtenstein", 0, 1);
        euroQualification2016.addGameResult("Oesterreich", "Russland", 1, 0);
        euroQualification2016.addGameResult("Montenegro", "Schweden", 1, 1);
        euroQualification2016.addGameResult("Montenegro", "Russland", 0, 3);
        euroQualification2016.addGameResult("Liechtenstein", "Oesterreich", 0, 5);
        euroQualification2016.addGameResult("Moldau", "Schweden", 0, 2);
        euroQualification2016.addGameResult("Liechtenstein", "Moldau", 1, 1);
        euroQualification2016.addGameResult("Russland", "Oesterreich", 0, 1);
        euroQualification2016.addGameResult("Schweden", "Montenegro", 3, 1);
        euroQualification2016.addGameResult("Russland", "Schweden", 1, 0);
        euroQualification2016.addGameResult("Oesterreich", "Moldau", 1, 0);
        euroQualification2016.addGameResult("Montenegro", "Liechtenstein", 2, 0);
        euroQualification2016.addGameResult("Liechtenstein", "Russland", 0, 7);
        euroQualification2016.addGameResult("Moldau", "Montenegro", 0, 2);
        euroQualification2016.addGameResult("Schweden", "Oesterreich", 1, 4);
    }

    private static void printResultTable(List<Team> resultTable) {
        System.out.println("Team           Points +  -  0 shot rec diff"); 
        PrintStream printf = System.out.printf("%-15s   %2d %2d %2d %2d  %2d  %2d  %3d%n",resultTable.get(0).getName(),1,1,1,1,1,1,1);
        /*
         resultTable.get(0).getName(), resultTable.get(0).getPoints(), resultTable.get(0).getWins()
                , resultTable.get(0).getDefeats(), resultTable.get(0).getDraws(), resultTable.get(0).getGoalsShot(), resultTable.get(0).getGoalsReceived(), resultTable.get(0).getGoalDifference())
                 
                 */
    }
}
