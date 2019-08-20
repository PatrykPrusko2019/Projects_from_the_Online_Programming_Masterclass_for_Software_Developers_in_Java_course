package chapter_1_to_8.exercise_35_36_kurs;

/**
 * Speed Converter
 */
public class Main {

    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
