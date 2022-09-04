package ua.hillelit.lms.steeplechase;

import ua.hillelit.lms.steeplechase.models.obstacles.Obstacle;
import ua.hillelit.lms.steeplechase.models.obstacles.Treadmill;
import ua.hillelit.lms.steeplechase.models.obstacles.Wall;
import ua.hillelit.lms.steeplechase.models.participants.Cat;
import ua.hillelit.lms.steeplechase.models.participants.Human;
import ua.hillelit.lms.steeplechase.models.participants.Participant;
import ua.hillelit.lms.steeplechase.models.participants.Robot;
import ua.hillelit.lms.steeplechase.view.ViewRace;

public class Main {
    public static void main(String[] args) {

        Participant peter = new Human("Peter",600,1.5);
        Participant terminator = new Robot("Terminator", 500, 2.6);
        Participant murchik = new Cat("Murchik",400,1.4);

        Participant[] participants = {peter,terminator,murchik};

        Obstacle one = new Treadmill("Short", 300);
        Obstacle twu = new Wall("Brick",2);
        Obstacle tre = new Wall("Wood",1.1);

        Obstacle[] obstacles = {one,twu,tre};

        ViewRace viewRace = new ViewRace("1",participants,obstacles);
        viewRace.raceControl();

    }
}
