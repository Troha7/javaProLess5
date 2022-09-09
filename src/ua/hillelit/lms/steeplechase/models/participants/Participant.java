package ua.hillelit.lms.steeplechase.models.participants;

public abstract class Participant {

    private final String name;
    private final int maxRunDistance;
    private final double maxJumpHeight;

    private final String className = this.getClass().getSimpleName();

    public Participant(String name, int maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String run() {
        return " run";
    }

    public String jump() {
        return " jump";
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
