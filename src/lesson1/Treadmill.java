package lesson1;

public class Treadmill implements Obstacle {
    private final int timeOfRun;

    public Treadmill(int timeOfRun) {
        this.timeOfRun = timeOfRun;
    }

    @Override
    public void pass(Mobile mobile) {
        String str = mobile.run() > timeOfRun ? " пробежал дистанцию на беговой дорожке." : " не смог преодолеть дистанцию на беговой " +
                "дорожке.";
        System.out.println(str);
    }
}