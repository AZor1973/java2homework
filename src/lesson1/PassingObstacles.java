package lesson1;

public class PassingObstacles {
    public static void main(String[] args) {
        Participant human1 = new Human("Вася", 2, 2000);
        Participant human2 = new Human("Петя", 1, 5000);
        Participant cat1 = new Cat("Барсик", 1, 3500);
        Participant cat2 = new Cat("Мурзик", 2, 3000);
        Participant robot1 = new Robot("R2D2", 10, 500);
        Participant robot2 = new Robot("Solo", 12, 10000);
        Obstacle wall1 = new Wall(2);
        Obstacle wall2 = new Wall(1);
        Obstacle treadMill1 = new Treadmill(1000);
        Obstacle treadMill2 = new Treadmill(3000);

        Participant[] participants = {human1, human2, cat1, cat2, robot1, robot2};
        Obstacle[] obstacles = {wall1, wall2, treadMill1, treadMill2};

        for (Obstacle obstacle : obstacles) {
            System.out.println(obstacle);
            for (Participant participant : participants) {
                obstacle.pass(participant);
            }
        }
    }
}

