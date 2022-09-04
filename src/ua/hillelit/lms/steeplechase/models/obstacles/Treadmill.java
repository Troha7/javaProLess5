package ua.hillelit.lms.steeplechase.models.obstacles;

public class Treadmill extends Obstacle {

    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public String overcome(double value) {

        if (value > length) {
            return "[OVERCOMING!]";
        } else {
            return "[DID NOT OVERCOMING!]";
        }

    }

    @Override
    public String getDistance() {
        return " at distance [" + length + "] m.";
    }

}
