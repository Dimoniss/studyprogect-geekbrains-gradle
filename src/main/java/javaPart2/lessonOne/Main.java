package javaPart2.lessonOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Object[] participants = {
                new Human(20, 20),
                new Robot(20, 30),
                new Cat(10, 20)
        };

        Object[] obstacles = new Object[10];

        for (int i = 1; i < obstacles.length; i++) {
            if (i % 2 == 0) obstacles[i-1] = new RunningTrack(i*5);
            else obstacles[i-1] = new Wall(i*5);
        }

        for (Object obj : participants) {
            if (obj instanceof Human) {
                for (Object obst: obstacles) {
                    if (obst instanceof RunningTrack) {
                        boolean result = ((Human) obj).run(((RunningTrack) obst).isLong);
                        if (!result) break;
                    } else if (obst instanceof Wall) {
                        boolean result = ((Human) obj).jump(((Wall) obst).height);
                        if (!result) break;
                    }
                }
            }

            if (obj instanceof Robot) {
                for (Object obst: obstacles) {
                    if (obst instanceof RunningTrack) {
                        boolean result = ((Robot) obj).run(((RunningTrack) obst).isLong);
                        if (!result) break;
                    } else if (obst instanceof Wall) {
                        boolean result = ((Robot) obj).jump(((Wall) obst).height);
                        if (!result) break;
                    }
                }
            }

            if (obj instanceof Cat) {
                for (Object obst: obstacles) {
                    if (obst instanceof RunningTrack) {
                        boolean result = ((Cat) obj).run(((RunningTrack) obst).isLong);
                        if (!result) break;
                    } else if (obst instanceof Wall) {
                        boolean result = ((Cat) obj).jump(((Wall) obst).height);
                        if (!result) break;
                    }
                }
            }
        }
    }
}
