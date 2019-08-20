package chapter_1_to_8.exercise_63;

/**
 * Created by dev on 8/3/15.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;//nogi
    private int tail;//ogon
    private int teeth;//zeby
    private String coat;//plaszcz

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
