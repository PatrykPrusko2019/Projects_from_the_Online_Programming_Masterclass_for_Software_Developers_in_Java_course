package chapter_1_to_8;

import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("give me a number: ");
        checkNumber(sc.nextInt() );




    }

    public static void checkNumber(int number) {

        if(number > 0) {
            System.out.println(number + "-> positive number ");
        } else if(number < 0) {
            System.out.println(number + "-> negative number");
        } else {
            System.out.println(number + "-> zero");
        }

    }
}
