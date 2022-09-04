package ua.hillelit.lms.steeplechase.controller;

import ua.hillelit.lms.steeplechase.models.obstacles.Obstacle;
import ua.hillelit.lms.steeplechase.models.obstacles.Treadmill;
import ua.hillelit.lms.steeplechase.models.participants.Participant;

public class ObstacleControl {

    private Participant participant;
    private Obstacle obstacle;

    public ObstacleControl(Participant participant, Obstacle obstacle) {
        this.participant = participant;
        this.obstacle = obstacle;
    }

    public String participantMove() {

        if (obstacle instanceof Treadmill) {
            return participant.run();
        } else {
            return participant.jump();
        }

    }

    public String obstaclePassing() {

        double value;

        if (obstacle instanceof Treadmill) {
            value = participant.getMaxRunDistance();
        } else {
            value = participant.getMaxJumpHeight();
        }
        return obstacle.overcome(value);

    }

}
