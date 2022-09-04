package ua.hillelit.lms.steeplechase.models.obstacles;

public class Wall extends Obstacle {

    private double height;

    public Wall(String name, double height) {
        super(name);
        this.height = height;
    }

    @Override
    public String overcome(double value) {

        if (value > height) {
            return "[OVERCOMING!]";
        } else {
            return "[DID NOT OVERCOMING!]";
        }

    }

    @Override
    public String getDistance() {
        return " at height [" + height + "] m.";
    }

}
