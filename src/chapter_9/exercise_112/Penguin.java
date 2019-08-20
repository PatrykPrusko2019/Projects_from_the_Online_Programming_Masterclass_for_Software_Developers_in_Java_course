package chapter_9.exercise_112;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
