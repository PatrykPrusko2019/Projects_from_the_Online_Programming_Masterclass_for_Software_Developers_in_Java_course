package chapter_1_to_8.exercise_35_showsKilometetsPerHour;

/**
 * shows kilometers Per Hour
 */

import static chapter_1_to_8.exercise_35_showsKilometetsPerHour.SpeedConverter.toMilesPerHour;

/**
 * first.5   -> first.5 = first
 * 10.25 -> 6
 * -5.6  -> Invalid Value
 * 25.42 -> 25.42 = 16
 * 75.114-> 75.114 = 47
 */
public class Exercise_35 {
    public static void main(String[] args) {

        System.out.println( toMilesPerHour(1.5));
        System.out.println( toMilesPerHour(10.25));
        System.out.println( toMilesPerHour(-5.6));
        System.out.println( toMilesPerHour(25.42));
        System.out.println( toMilesPerHour(75.114));


    }

}
