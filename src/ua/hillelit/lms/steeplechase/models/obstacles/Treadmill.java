package ua.hillelit.lms.steeplechase.models.obstacles;

import ua.hillelit.lms.steeplechase.models.participants.Participant;

public class Treadmill extends Obstacle {

    private final int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {

        return participant.getMaxRunDistance() > length;

    }

    @Override
    public String viewOvercoming(Participant participant) {

        String str = participant.run() + " & ";
        if (overcome(participant)) {
            str += "[OVERCOMING!]";
        } else {
            str += "[DID NOT OVERCOMING!]";
        }
        return str;

    }

    @Override
    public String getDistance() {
        return " at distance [" + length + "] m.";
    }

}
