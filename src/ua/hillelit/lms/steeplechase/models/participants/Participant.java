package ua.hillelit.lms.steeplechase.models.participants;

import ua.hillelit.lms.steeplechase.api.Movable;

public abstract class Participant implements Movable {

    private String name;
    private int maxRunDistance;
    private double maxJumpHeight;

    private final String className = this.getClass().getSimpleName();

    public Participant(String name, int maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public String run() {
        return className + " " + name + " run";
    }

    @Override
    public String jump() {
        return className + " " + name + " jump";
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public String getName() {
        return className + " " + name;
    }

}
