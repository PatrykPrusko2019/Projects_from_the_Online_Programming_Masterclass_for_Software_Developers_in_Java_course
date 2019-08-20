package chapter_1_to_8;

/**
 * calculate Store
 */
public class Exercise_28 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalStore = calculateStore(gameOver, score, levelCompleted, bonus);

        System.out.println("result to method -> " + finalStore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        gameOver = false;

        finalStore = calculateStore(gameOver, score, levelCompleted, bonus);
        System.out.println("result to method -> " + finalStore);

    }



    public static int calculateStore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore;
        if(gameOver) {//jesli true
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;

        } else {//jesli false
            return -1;
        }
    }


}


