package chapter_1_to_8.exercise_40.exercise_5;
/**
 *Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
 *
 * The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
 *
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
 *
 * * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
 *
 * * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
 *
 * * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
 *
 *
 * TIP: Use paper and pencil.
 *
 * TIP: Use casting.
 *
 * NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
 * NOTE: Do not add a  main method to solution code.
 */
//decimal -> dziesietny
public class DecimalComparator {

    public static void main(String[] args) {


        System.out.println( areEqualByThreeDecimalPlaces(-3.1756, -3.175) );
        System.out.println( areEqualByThreeDecimalPlaces(3.175, 3.176) );
        System.out.println( areEqualByThreeDecimalPlaces(3.0, 3.0) );
        System.out.println( areEqualByThreeDecimalPlaces(-3.123, 3.123) );

        System.out.println( areEqualByThreeDecimalPlaces(-3.1756, -3.175) );
        System.out.println( areEqualByThreeDecimalPlaces(3.175, 3.176) );
        System.out.println( areEqualByThreeDecimalPlaces(3.0, 3.0) );
        System.out.println( areEqualByThreeDecimalPlaces(-3.123, 3.123) );

    }


    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        boolean result = false;


        int intValue = (int) first; //usuwam czesc ulamkowa
        int intValue2 = (int) second;

        if(intValue == intValue2) { //taka sama liczba calkowita

            first  = first  * 1000; // 3 miejsca po przecinku wyznaczamy
            second = second * 1000;

            int intRestFirst = (int) first;
            int intRestSecond = (int) second;

            if(intRestFirst == intRestSecond) {
                result = true;
            }
        }

        return result;
    }

    public static boolean areEqualByThreeDecimalPlaces2(double first, double second) {
        boolean result = false;

            first  = first  * 1000; // 3 miejsca po przecinku wyznaczamy
            second = second * 1000;

            int intFirst = (int) first;
            int intSecond = (int) second;

            if(intFirst == intSecond) {
                result = true;
            }


        return result;
    }


}
