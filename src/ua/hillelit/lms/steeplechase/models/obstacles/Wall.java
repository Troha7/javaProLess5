package ua.hillelit.lms.steeplechase.models.obstacles;

public class Wall extends Obstacle{
    private double height;

    public Wall(String name, double height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean overcome(double value) {
        return value > height;
    }

    @Override
    public String getDistance() {
        return  " at height [" + height + "] m.";
    }
}
