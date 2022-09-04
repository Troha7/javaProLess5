package ua.hillelit.lms.steeplechase.models.obstacles;

public class Treadmill extends Obstacle{
    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean overcome(double value) {
        return value > length;
    }

    @Override
    public String getDistance() {
        return " at distance [" + length + "] m.";
    }
}
