package chapter_1_to_8.exercise_44;
/**
 * Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
 *
 * The method should not return any value (hint: void)
 *
 * Using a switch statement print "Sunday", "Monday", ... ,"Saturday" if the int parameter "day" is 0, first, ... , 6
 * respectively, otherwise it should print "Invalid day".
 *
 * Bonus:
 * 	Write a second solution using if then else, instead of using switch.
 * 	Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh
 */
public class DayOfTheWeekChallenge {

    public static void main(String[] args ) {


        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);

        printDayOfTheWeek_2(0);
        printDayOfTheWeek_2(1);
        printDayOfTheWeek_2(2);
        printDayOfTheWeek_2(3);
        printDayOfTheWeek_2(4);
        printDayOfTheWeek_2(5);
        printDayOfTheWeek_2(6);



    }


    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Monday " + day);
                break;

            case 1:
                System.out.println("Tuesday " + day);
                break;

            case 2:
                System.out.println("Wednesday " + day);
                break;
            case 3:
                System.out.println("Thursday " + day);
                break;
            case 4:
                System.out.println("Friday " + day);
                break;
            case 5:
                System.out.println("Saturday " + day);
                break;
            case 6:
                System.out.println("Sunday " + day);
                break;

            default:
                System.out.println("Invalid day");
                break;
        }

    }

        public static void printDayOfTheWeek_2(int day) {

            String weekName = "";

            if(day >= 0 && day <= 6) {

                if (day == 0) {
                    weekName = "Monday";
                } else if (day == 1) {
                    weekName = "Tuesday";
                } else if (day == 2) {
                    weekName = "Wednesday";
                } else if (day == 3) {
                    weekName = "Thursday";
                } else if (day == 4) {
                    weekName = "Friday";
                } else if (day == 5) {
                    weekName = "Saturday";
                } else if (day == 6) {
                    weekName = "Sunday";
                }
                System.out.println(weekName + " " + day);

            } else {
                System.out.println("Invalid day");
            }

        }


}


