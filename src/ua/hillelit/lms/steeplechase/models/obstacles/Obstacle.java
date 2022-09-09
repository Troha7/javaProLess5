package ua.hillelit.lms.steeplechase.models.obstacles;

import ua.hillelit.lms.steeplechase.models.participants.Participant;

public abstract class Obstacle {

    private final String name;

    private final String className = this.getClass().getSimpleName();

    public Obstacle(String name) {
        this.name = name;
    }

    public abstract boolean overcome(Participant participant);

    public abstract String viewOvercoming(Participant participant);

    public abstract String getDistance();

    public String getName() {
        return name + " " + className;
    }

}
