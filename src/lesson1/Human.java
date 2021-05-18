package lesson1;

public class Human implements Mobile {
    private final String name;
    private final int maxHeightJump;
    private final int maxTimeOfRun;

    public Human(String name, int maxHeightJump, int maxTimeOfRun) {
        this.name = name;
        this.maxHeightJump = maxHeightJump;
        this.maxTimeOfRun = maxTimeOfRun;
    }

    @Override
    public int run() {
        System.out.print(name);
        return maxTimeOfRun;
    }

    @Override
    public int jump() {
        System.out.print(name + " прыгнул и");
        return maxHeightJump;
    }
}

