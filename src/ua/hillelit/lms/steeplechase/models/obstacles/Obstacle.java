package ua.hillelit.lms.steeplechase.models.obstacles;

import ua.hillelit.lms.steeplechase.api.Overcomable;

public abstract class Obstacle implements Overcomable {

    private String name;

    private final String className = this.getClass().getSimpleName();

    public Obstacle(String name) {
        this.name = name;
    }

    public abstract String getDistance();

    @Override
    public abstract String overcome(double value);

    public String getName() {
        return name + " " + className;
    }

}
