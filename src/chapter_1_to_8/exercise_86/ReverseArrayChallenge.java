package chapter_1_to_8.exercise_86;

public class ReverseArrayChallenge {
    public static void main(String[] args) {

        int[] tabInt = {1, 2, 3, 4, 5};
        System.out.println("tab before reserve");
        for(int i = 0; i < tabInt.length; i++) {
            System.out.println(tabInt[i]);
        }


        reverse(tabInt);



    }


    private static void reverse(int[] tab) {

        int[] reverseTab = new int[tab.length];

        for(int i = 0; i < tab.length; i++) {
            reverseTab[i] = tab[tab.length-1 - i];
        }

        tab = reverseTab;

        System.out.println("reserve tab");
        for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }
}
