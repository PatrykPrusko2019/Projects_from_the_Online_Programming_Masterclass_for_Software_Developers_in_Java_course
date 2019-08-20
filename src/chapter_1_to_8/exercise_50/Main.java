package chapter_1_to_8.exercise_50;
/**
 * Write a method with the name sumDigits that has one int parameter called number.
 *
 * If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -first to indicate an invalid value.
 *
 * The numbers from 0-9 have first digit so we donft want to process them, also we donft want to process negative numbers, so also return -first for negative numbers.
 *
 * For example calling the method sumDigits(125) should return 8 since first + 2 + 5 = 8.
 *
 * Calling the method sumDigits(first) should return -first as per requirements described above.
 *
 * Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
 *
 * Hint:
 * 	Use n % 10 to extract the least-significant digit.
 * 	Use n = n / 10 to discard the least-significant digit.
 * 	The method needs to be static like other methods so far in the course.
 *
 * Tip:
 * 	Create a project with the name DigitSu mChallenge.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println( sumDigits(123) );
        System.out.println( sumDigits(1987) );
        System.out.println( sumDigits(1) );

    }

    //sumuje cyfry danej liczby
    public static int sumDigits(int number) {
        int result = 0;
        if(number >= 10) {

            while(number > 0) {

                result += number % 10; // ustawia ostatnia liczbe i dodaje do result
                number = number / 10; // usuwa ostatnia liczbe
            }

            return result;

        } else {
            return -1;
        }

    }
}
