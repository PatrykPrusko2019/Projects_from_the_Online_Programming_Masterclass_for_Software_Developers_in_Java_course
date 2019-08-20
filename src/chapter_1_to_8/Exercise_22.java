package chapter_1_to_8;

public class Exercise_22 {

    public static void main(String[] args) {

        System.out.println();//sout -> System.out.println();

        boolean isCar = false;

        if(isCar == true) {
            System.out.println(isCar);
        }


        boolean wasCar = isCar ? true : false;

        System.out.println(wasCar );

        //challange
        // first. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.

        double value1 = 20d;
        double value2 = 80;

        double total = (value1 + value2) * 25;
        System.out.println("my total -> " + total);

        double remainder = total % 40;

        if(remainder <= 20) {
            System.out.println("total was over the limit: " + remainder);
        }








    }

}
