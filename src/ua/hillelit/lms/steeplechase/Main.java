package ua.hillelit.lms.steeplechase;

import ua.hillelit.lms.steeplechase.models.obstacles.Obstacle;
import ua.hillelit.lms.steeplechase.models.obstacles.Treadmill;
import ua.hillelit.lms.steeplechase.models.obstacles.Wall;
import ua.hillelit.lms.steeplechase.models.participants.Cat;
import ua.hillelit.lms.steeplechase.models.participants.Human;
import ua.hillelit.lms.steeplechase.models.participants.Participant;
import ua.hillelit.lms.steeplechase.models.participants.Robot;
import ua.hillelit.lms.steeplechase.controller.RaceControl;

public class Main {
    public static void main(String[] args) {

        Participant vasil = new Human("Vasil",750,1.5);
        Participant terminator = new Robot("Terminator", 1000, 2.6);
        Participant murchik = new Cat("Murchik",400,1.4);

        Participant[] participants = {vasil, terminator, murchik};

        Obstacle obst1 = new Treadmill("Short", 100);
        Obstacle obst2 = new Wall("Wood",1.1);
        Obstacle obst3 = new Wall("Brick",2);
        Obstacle obst4 = new Treadmill("Midl", 450);
        Obstacle obst5 = new Wall("Steel",2.5);
        Obstacle obst6 = new Treadmill("Long", 950);

        Obstacle[] obstacles = {obst1, obst2, obst3, obst4, obst5, obst6};

        RaceControl viewRace = new RaceControl("Сrazy",participants,obstacles);
        viewRace.race();

    }
}
