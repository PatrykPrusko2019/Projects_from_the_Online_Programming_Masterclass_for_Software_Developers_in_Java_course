package chapter_1_to_8.exercise_87;

import java.util.Scanner;

/**
 * tests array
 */
public class ArrayResizeDemo {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[3];

    public static void main(String[] args) {
        System.out.println("Enter 3 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 5 integers:");
        getInput();
       baseData[3] = 67;
       baseData[4] = 34;
        printArray(baseData);

    }

    private static void getInput()
    {
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    private static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    private static void resizeArray()
    {
        int[] original = baseData;

        baseData = new int[5];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }

}
