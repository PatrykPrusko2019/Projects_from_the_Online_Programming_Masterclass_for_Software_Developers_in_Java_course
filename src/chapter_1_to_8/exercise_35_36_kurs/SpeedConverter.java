package chapter_1_to_8.exercise_35_36_kurs;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609); // first.609 -> first mila -> first.609 km/h
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h= " + milesPerHour +
                    " mi/h");

        }
    }
}
