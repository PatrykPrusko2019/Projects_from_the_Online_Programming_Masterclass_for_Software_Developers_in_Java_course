package chapter_1_to_8.exercise_43;
/**
 // Create a new switch statement using char instead of int          -> instread - zamiast
 // create a new char variable
 // create a switch statement testing for
 // A, B, C, D, or E
 // display a message if any of these are found and then break
 // Add a default which displays a message saying not found
 */
public class Challenge_switch_statement {
    public static void main(String[] args) {

        char a = 'B';

        switch (a) {
            case 'A':
                System.out.println("found " + a);
                break;

            case 'B':
                System.out.println("found " + a);
                break;

            case 'C':
                System.out.println("found " + a);
                break;

            case 'D':
                System.out.println("found " + a);
                break;

            case 'E':
                System.out.println("found " + a);
                break;
            default:
                System.out.println("could not found A B C D or E");
                break;
        }

        switch (a) {
            case 'A':
                System.out.println("found " + a);
                break;

            case 'B':
                System.out.println("found " + a);
                break;

            case 'C': case 'D': case 'E':
                System.out.println("found " + a);
                break;
        default:
                System.out.println("could not found A B C D or E");
                break;
        }





    }
}
