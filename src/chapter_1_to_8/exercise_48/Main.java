package chapter_1_to_8.exercise_48;
/**
 * // Create a method called isEvenNumber that takes a parameter of type int
 *     // Its purpose is to determine if the argument passed to the method is
 *     // an even number or not.
 *     // return true if an even number, otherwise return false;
 */

/**
 * // Modify the while code above
 *         // Make it also record the total number of even numbers it has found
 *         // and break once 5 are found
 *         // and at the end, display the total number of even numbers found
 */
public class Main {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;

        /*
        while(number <= finishNumber) {

            number++;
            if( ! isEvenNumber(number) ) {//jesli parzysty numer to neguj -> czyli jesli true zmien na false i sie nie wykonuj i drukuj liczbe parzysta
                continue;
            }

            System.out.println("even number " + number);
        }

        */

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
          // and break once 5 are found
         // and at the end, display the total number of even numbers found

        int totalNumberFound = 0 ;
        while (number <= finishNumber) {

            if( isEvenNumber(number) ) {

                totalNumberFound++;
                System.out.println(" number even -> " + number );
            }

            if(totalNumberFound == 5) break; //jesli znajdzie 5 liczb parzystych to wyjdz z petli

            number++;
        }
        System.out.println("total number of even numbers -> " + totalNumberFound);






    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


