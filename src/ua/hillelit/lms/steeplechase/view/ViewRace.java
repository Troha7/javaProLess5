package ua.hillelit.lms.steeplechase.view;

import ua.hillelit.lms.steeplechase.controller.ObstacleControl;
import ua.hillelit.lms.steeplechase.models.obstacles.Obstacle;
import ua.hillelit.lms.steeplechase.models.participants.Participant;

public class ViewRace {

    private String raceName;
    private Participant[] participant;
    private Obstacle[] obstacle;

    private String temp = "";

    public ViewRace(String raceName, Participant[] participant, Obstacle[] obstacle) {
        this.raceName = raceName;
        this.participant = participant;
        this.obstacle = obstacle;
    }

    public void raceControl(){

        System.out.println("RACE: " + raceName);

        for (int i = 0; i < participant.length; i++) {
            System.out.println("Track: " + (i + 1));
            System.out.println(participant[i].getName() + " [STARTS!]");
            for (int j = 0; j < obstacle.length; j++) {
                ObstacleControl control = new ObstacleControl(participant[i],obstacle[j]);
                if(!trackControl(j, control)){
                    break;
                }
            }
        }
        System.out.println("THE RACE IS OVER");
    }

    private boolean trackControl(int j, ObstacleControl control) {
        if(control.obstaclePassing()){
            printObstacleOvercome(j, control);
            return true;
        }
        else{
            printObstacleNotOvercome(j, control);
            return false;
        }
    }

    private void printObstacleOvercome(int j, ObstacleControl control) {
        String str = control.participantMove() + " & [OVERCOMING!] the "
                + obstacle[j].getName() + obstacle[j].getDistance();
        temp = "Last [OVERCOMING!] the " + obstacle[j].getName() + obstacle[j].getDistance();
        System.out.println(str);
    }

    private void printObstacleNotOvercome(int j, ObstacleControl control) {
        String str = control.participantMove() + " & [DID NOT OVERCOMING!] the "
                + obstacle[j].getName() + obstacle[j].getDistance();
        String lastObstacle = "\nParticipant left the race! \n" + temp;
        System.out.println(str + lastObstacle);
    }

}
