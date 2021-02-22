import cardgame.*;

/**
 * CardGameTest
 * 
 * @author Abdullah Riaz (22001296), Mohammed Sohail (22001513) and Mostafa
 *         Khaled (22001062)
 * @version 22/02/2021
 */

public class CardGameTest {
    public static void main(String[] args) {

        System.out.println("Start of CardGameTest\n");

        // variables
        Card c;
        Cards cards;
        ScoreCard scores;
        Player p;

        // program code

        // test Card class
        c = new Card(0);
        System.out.println(c);
        System.out.println();

        // test Cards class
        cards = new Cards(true);
        cards.addTopCard(c);
        cards.shuffle();

        // test ScoreCard class
        scores = new ScoreCard(4);
        scores.update(3, 1);
        scores.update(1, 2);
        System.out.println("\n" + scores);

        // test Player class
        p = new Player("pg");
        p.playCard();

        // Once you have all the bits working, complete the MyCardGame program
        // that provides a menu allowing any of the players to play their card,
        // an option to see the score card, and one to quit the game at any time.
        // When the game is over it should print out the winners.

        System.out.println("\nEnd of CardGameTest\n");
    }

} // end of class CardGameTest
