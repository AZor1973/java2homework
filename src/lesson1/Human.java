package lesson1;

public class Human implements Participant {
    private final String name;
    private final int maxHeightJump;
    private final int maxDistanceOfRun;

    public Human(String name, int maxHeightJump, int maxDistanceOfRun) {
        this.name = name;
        this.maxHeightJump = maxHeightJump;
        this.maxDistanceOfRun = maxDistanceOfRun;
    }

    @Override
    public int run() {
        System.out.print(name);
        return maxDistanceOfRun;
    }

    @Override
    public int jump() {
        System.out.print(name + " прыгнул и");
        return maxHeightJump;
    }
}

