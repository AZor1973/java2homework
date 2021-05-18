package lesson1;

public class PassingObstacles {
    public static void main(String[] args) {
        Mobile human1 = new Human("Вася", 2, 20);
        Mobile human2 = new Human("Петя", 1, 35);
        Mobile cat1 = new Cat("Барсик", 1, 60);
        Mobile cat2 = new Cat("Мурзик", 2, 70);
        Mobile robot1 = new Robot("R2D2", 10, 5);
        Mobile robot2 = new Robot("Solo", 12, 100);
        Obstacle wall = new Wall(2);
        Obstacle treadMill = new Treadmill(30);

        Mobile[] mobiles = {human1, human2, cat1, cat2, robot1, robot2};
        Obstacle[] obstacles = {wall, treadMill};

        for (Obstacle obstacle : obstacles) {
            for (Mobile mobile : mobiles) {
                obstacle.pass(mobile);
            }
        }
    }
}

