package ua.hillelit.lms.steeplechase.models.obstacles;

import ua.hillelit.lms.steeplechase.models.participants.Participant;

public class Wall extends Obstacle {

    private final double height;

    public Wall(String name, double height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {

        return participant.getMaxJumpHeight() > height;

    }

    @Override
    public String viewOvercoming(Participant participant) {

        String str = participant.jump() + " & ";
        if (overcome(participant)) {
            str += "[OVERCOMING!]";
        } else {
            str += "[DID NOT OVERCOMING!]";
        }
        return str;

    }

    @Override
    public String getDistance() {
        return " at height [" + height + "] m.";
    }

}
