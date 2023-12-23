package LearnMethods;

public class MethodChallenge1 {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int result = 0;

        if(playerScore >= 1000){

            result = 1;
        }
        else if(playerScore >= 500 && playerScore < 1000){

            result = 2;
        }
        else if(playerScore >= 100 && playerScore < 500){

            result = 3;
        }
        else{

            result = 4;
        }

        return result;

    }
}
