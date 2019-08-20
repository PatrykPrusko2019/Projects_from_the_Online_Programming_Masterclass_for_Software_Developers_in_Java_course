package chapter_1_to_8.exercise_40.exercise_6;

/**
 * Write a method hasEqualSum with 3 parameters of type int.
 *
 * The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
 *
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * * hasEqualSum(first, first, first);  should return false since first + first is not equal to first
 *
 * * hasEqualSum(first, first, 2);  should return true since first + first is equal to 2
 *
 * * hasEqualSum(first, -first, 0);  should return true since first + (-first) is first - first and is equal to 0
 *
 *
 * NOTE: The hasEqualSum method  needs to be defined as public static like we have been doing so far in the course.
 * NOTE: Do not add a  main method to solution code.
 */
public class EqualSumChecker {

    public static void main(String[] args) {


        System.out.println( hasEqualSum(1, 1, 1) );
        System.out.println( hasEqualSum(1, 1, 2) );
        System.out.println( hasEqualSum(1, -1, 0) );

    }



    public static boolean hasEqualSum(int first, int second, int third) {

        boolean result = false;

        int resultSum = first + second;
        if(resultSum == third) {
            result = true;
        }

        return result;
    }


}
