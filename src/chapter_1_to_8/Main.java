package chapter_1_to_8;

public class Main {

    public static void main(String[] args) {

        byte value = 5;
        short value1 = 10;
        int value2 = 15;

        long valueLong = 50000L + 10L * (value + value1 + value2);

        float f = (float) 5.24;
        float f_2 = 5.24f;

        System.out.println(valueLong);

        //exercise 2

        double pounds = 200d; //d -> double
        double kilograms = 0.45359227d;

        kilograms =  kilograms *  pounds; // nie musi byc cast

        System.out.println(kilograms);

        //char
        char c = '\u00AE'; //znak z unicode z strony unicode -table.com




        System.out.println(c);

    }
}
