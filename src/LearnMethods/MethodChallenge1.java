package LearnMethods;

public class MethodChallenge1 {
    public static void main(String[] args) {


        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Mike", calculateHighScorePosition(1000));
        displayHighScorePosition("Mosh", calculateHighScorePosition(500));
        displayHighScorePosition("Bob", calculateHighScorePosition(100));
        displayHighScorePosition("Percy", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }

        return 4;


        //        int position = 4;
        //        if (playerScore >= 1000) {
        //            position = 1;
        //        } else if (playerScore >= 500) {
        //            position = 2;
        //        } else if (playerScore >= 100) {
        //            position = 3;
        //        }
        //
        //        return position;


//        int score = calculateHighScorePosition(1500);
//        displayHighScorePosition("Tim", score);
//
//        score = calculateHighScorePosition(1000);
//        displayHighScorePosition("Mike", score);
//
//        score = calculateHighScorePosition(500);
//        displayHighScorePosition("Mosh", score);
//
//        score = calculateHighScorePosition(100);
//        displayHighScorePosition("Bob", score);
//
//        score = calculateHighScorePosition(25);
//        displayHighScorePosition("Percy", score);
//
//    }
//
//    public static void displayHighScorePosition(String playerName, int position) {
//
//        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
//
//
//    }
//
//    public static int calculateHighScorePosition(int score) {
//        int result;
//
//        if (score >= 1000) {
//
//            result = 1;
//
//        } else if (score >= 500) {
//
//            result = 2;
//
//        } else if (score >= 100) {
//
//            result = 3;
//
//        } else result = 4;
//
//        return result;

    }
}