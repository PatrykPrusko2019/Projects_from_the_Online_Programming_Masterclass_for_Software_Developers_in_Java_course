package chapter_1_to_8.exercise_56;

import java.util.Scanner;

/**
 * -Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * -Create a Scanner like we did in the previous video.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message gEnter number #x:h where x represents the count, i.e. first, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be gEnter number #first:h, the next gEnter number #2: h, and so on.
 *
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you donft need it anymore.
 * -Create a project with the name ReadingUserInputChallenge.
 */
public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0, sumValue = 0;

        while(count < 10) {

            System.out.println("Enter number #" + (count + 1));
            boolean hasNextInt = sc.hasNextInt();

            if (hasNextInt) { //jesli true
                int number = sc.nextInt();
                sumValue += number;
                count++;
            } else {
                System.out.println("Invalid Value");
            }
            sc.nextLine(); // handle end of line (enter key)

        }
        sc.close(); // zamykam strumien

        System.out.println("sum of 10 values : " + sumValue );





    }






}
