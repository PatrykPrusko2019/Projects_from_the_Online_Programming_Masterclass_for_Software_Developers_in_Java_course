package chapter_1_to_8.exercise_35_showsKilometetsPerHour;

/**
 * shows kilometers Per Hour
 */
//0.62 km/h -> first mila
 public class SpeedConverter {

    private static double milesPerHour;

    public static long toMilesPerHour(double kilometersPerHour) {
        milesPerHour = 0.62;//zeby za kazdym razem  mmial prawidlowa wartosc

        if(kilometersPerHour < 0) {

            return -1;
        } else {
            milesPerHour *= kilometersPerHour;
            milesPerHour = Math.round(milesPerHour); //round() -> zaokragla do first.5 -> 2
        }

        return (long) milesPerHour;
    }


}
