package ua.hillelit.lms.steeplechase.controller;

import ua.hillelit.lms.steeplechase.models.obstacles.Obstacle;
import ua.hillelit.lms.steeplechase.models.participants.Participant;

import java.util.Objects;

public class RaceControl {

    private String raceName;
    private Participant[] participant;
    private Obstacle[] obstacle;

    public RaceControl(String raceName, Participant[] participant, Obstacle[] obstacle) {
        this.raceName = raceName;
        this.participant = participant;
        this.obstacle = obstacle;
    }

    public void race() {

        System.out.println(raceName + " RACE");
        String lastOvercoming = "";

        for (int i = 0; i < participant.length; i++) {

            System.out.println("Track: " + (i + 1));
            System.out.println(participant[i].getName() + " [STARTS!]");

            for (int j = 0; j < obstacle.length; j++) {

                ObstacleControl control = new ObstacleControl(participant[i], obstacle[j]);
                printObstacleOvercome(j, control);

                if (Objects.equals(control.obstaclePassing(), "[DID NOT OVERCOMING!]")) {
                    System.out.println(participant[i].getName() + " [LEFT THE RACE!] " + lastOvercoming);
                    break;
                }

                lastOvercoming = "Last " + control.obstaclePassing()
                        + " the " + obstacle[j].getName() + obstacle[j].getDistance();
            }
        }

        System.out.println(raceName + " RACE IS OVER");

    }

    private void printObstacleOvercome(int num, ObstacleControl control) {

        String str = control.participantMove() + " & " + control.obstaclePassing() + " the "
                + obstacle[num].getName() + obstacle[num].getDistance();

        System.out.println(str);

    }

}
