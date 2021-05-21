package lesson1;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void pass(Participant participant) {
        String str = participant.jump() > height ? " перепрыгнул через стену." : " не смог перепрыгнуть через стену.";
        System.out.println(str);
    }
    public String toString(){
        return "\nСтена высотой " + height + " м.\n*************************";
    }
}