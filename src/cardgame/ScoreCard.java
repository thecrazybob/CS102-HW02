package cardgame;

import java.util.ArrayList;

/**
 * ScoreCard - Maintains one integer score per player, for any number of players
 * Caution: invalid playernumbers result in run-time exception!
 * 
 * @author Abdullah Riaz (22001296), Mohammed Sohail (22001513) and Mostafa
 *         Khaled (22001062)
 * @version 22/02/2021
 */

public class ScoreCard {

    // properties
    int[] scores;

    // constructor
    public ScoreCard(int noOfPlayers) {
        scores = new int[noOfPlayers];

        // init all scores to zero
        for (int i = 0; i < scores.length; i++)
            scores[i] = 0;
    }

    /**
     * Returns the score of the input player number
     * 
     * @param playerNo
     * @return int
     */
    // methods
    public int getScore(int playerNo) {
        return scores[playerNo];
    }

    /**
     * Updates the score of the input player number with the input amount
     * 
     * @param playerNo
     * @param amount
     */
    public void update(int playerNo, int amount) {
        scores[playerNo] += amount;
    }

    /**
     * Returns the string representation of the score card
     * 
     * @return String
     */
    public String toString() {
        String s;
        s = "\n" + "_____________\n" + "\nPlayer\tScore\n" + "_____________\n";

        for (int playerNo = 0; playerNo < scores.length; playerNo++) {
            s = s + (playerNo + 1) + "\t" + scores[playerNo] + "\n";
        }

        s += "_____________\n";
        return s;
    }

    /**
     * Returns the winner of the game
     * 
     * @return int[]
     */
    public int[] getWinners() {
        int[] winners;
        int highestScore = 0;
        ArrayList<Integer> winnersList = new ArrayList<Integer>();

        for (int i = 0; i < scores.length; i++) {
            highestScore = Math.max(highestScore, scores[i]);
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == highestScore) {
                winnersList.add(i);
            }
        }

        winners = new int[winnersList.size()];
        for (int i = 0; i < winnersList.size(); i++) {
            winners[i] = winnersList.get(i);
        }

        return winners;
    }

} // end class ScoreCard
