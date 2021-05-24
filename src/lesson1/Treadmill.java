package lesson1;

public class Treadmill implements Obstacle {
    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void pass(Participant participant) {
        String str = participant.run() > distance ? " пробежал дистанцию на беговой дорожке." : " не смог преодолеть дистанцию на беговой" +
                " дорожке.";
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "\nБеговая дорожка - " + distance + " м.\n*************************";
    }
}