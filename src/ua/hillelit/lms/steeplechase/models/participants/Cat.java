package ua.hillelit.lms.steeplechase.models.participants;

public class Cat extends Participant {

    public Cat(String name, int maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public String run() {
        return super.run();
    }

    @Override
    public String jump() {
        return super.jump();
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
