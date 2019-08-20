package chapter_9.exercise_112;


public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    } //dziobanie

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }

    public abstract void fly();
}
