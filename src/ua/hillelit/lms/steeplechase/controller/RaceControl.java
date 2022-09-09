package ua.hillelit.lms.steeplechase.controller;

import ua.hillelit.lms.steeplechase.models.obstacles.Obstacle;
import ua.hillelit.lms.steeplechase.models.participants.Participant;


public class RaceControl {

    private final String raceName;
    private final Participant[] participants;
    private final Obstacle[] obstacles;

    public RaceControl(String raceName, Participant[] participants, Obstacle[] obstacles) {
        this.raceName = raceName;
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void race() {

        String lastOvercoming = "";
        System.out.println(raceName + " RACE");

        for (Participant participant : participants) {
            System.out.println(participant.getName() + " [STARTS!]");

            for (Obstacle obstacle : obstacles) {

                System.out.println(viewParticipantResult(participant, obstacle));
                if (!obstacle.overcome(participant)) {
                    System.out.println("[LEFT THE RACE!] " + lastOvercoming);
                    break;
                }
                lastOvercoming = "Last " + viewParticipantResult(participant, obstacle);

            }

        }
        System.out.println(raceName + " RACE IS OVER");

    }

    private static String viewParticipantResult(Participant participant, Obstacle obstacle) {

        return participant.getName() + obstacle.viewOvercoming(participant) + " the "
                + obstacle.getName() + obstacle.getDistance();

    }

}
