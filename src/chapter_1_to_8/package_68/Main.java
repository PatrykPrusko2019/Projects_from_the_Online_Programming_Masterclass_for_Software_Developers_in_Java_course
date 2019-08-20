package chapter_1_to_8.package_68;

class Dog {

    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name= " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");

        rex.printName();
        fluffy.printName();
    }

}

