package LearnMethods;

public class MethodChallenge1 {
    public static void main(String[] args) {


        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", score);

        score = calculateHighScorePosition(900);
        displayHighScorePosition("Mike", score);

        score = calculateHighScorePosition(400);
        displayHighScorePosition("Mosh", score);

        score = calculateHighScorePosition(50);
        displayHighScorePosition("Bob", score);

    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score list");


    }

    public static int calculateHighScorePosition(int score) {
        int result;

        if (score >= 1000) {

            result = 1;

        } else if (score >= 500 && score < 1000) {

            result = 2;

        } else if (score >= 100 && score < 500) {

            result = 3;

        } else result = 4;



        return result;

    }
}
