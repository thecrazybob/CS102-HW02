import java.util.Scanner;
import cardgame.*;

/**
 * MyCardGame - provides a menu allowing any of the players to play their card,
 * an option to see the score card, and one to quit the game at any time. When
 * the game is over it dislays the winners.
 * 
 * @author Abdullah Riaz (22001296), Mohammed Sohail (22001513) and Mostafa
 *         Khaled (22001062)
 * @version 22/02/2021
 */

public class MyCardGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Start of MyCardGame\n");

        // constants
        final int MENU_EXIT = 0;
        final int MENU_PLAY_P1 = 1;
        final int MENU_PLAY_P2 = 2;
        final int MENU_PLAY_P3 = 3;
        final int MENU_PLAY_P4 = 4;
        final int MENU_SCORES = 5;

        // variables
        Player p1, p2, p3, p4;
        CardGame game;
        int selection;

        // program code

        // create players...
        p1 = new Player("p1");
        p2 = new Player("p2");
        p3 = new Player("p3");
        p4 = new Player("p4");

        // create game with the 4 players...
        game = new CardGame(p1, p2, p3, p4);

        // display menu, get and process selection, until exit
        do {
            // display menu
            System.out.println();
            System.out.println(
                    "MyCardGame   Round: " + game.getRoundNo() + "\t TurnOfPlayer: " + (game.getTurnOfPlayerNo() + 1));
            System.out.println();
            System.out.println(MENU_PLAY_P1 + " - Player " + MENU_PLAY_P1 + " plays");
            System.out.println(MENU_PLAY_P2 + " - Player " + MENU_PLAY_P2 + " plays");
            System.out.println(MENU_PLAY_P3 + " - Player " + MENU_PLAY_P3 + " plays");
            System.out.println(MENU_PLAY_P4 + " - Player " + MENU_PLAY_P4 + " plays");
            System.out.println(MENU_SCORES + " - Show scores");

            // ask for and get selection
            System.out.println();
            System.out.println("Selection (" + MENU_EXIT + " to exit): ");
            selection = scan.nextInt();

            // process selection
            if (selection == MENU_PLAY_P1)
                play(p1, game);

            else if (selection == MENU_PLAY_P2)
                play(p2, game);

            else if (selection == MENU_PLAY_P3)
                play(p3, game);

            else if (selection == MENU_PLAY_P4)
                play(p4, game);

            else if (selection == MENU_SCORES)
                System.out.println(game.showScoreCard());

            else if (selection != MENU_EXIT)
                System.out.println("Invalid selection! \n");

        } while (selection != MENU_EXIT && !game.isGameOver());

        if (game.isGameOver()) {
            if (game.getWinners().length > 1) {
                System.out.print("The Winners Are : " + game.getWinners()[0].getName());
                for (int i = 1; i < game.getWinners().length; i++) {
                    System.out.println(", " + game.getWinners()[i].getName());
                }
            } else {
                System.out.print("The Winner is : ");
                System.out.println(game.getWinners()[0].getName());
            }
        }

        System.out.println("\nEnd of MyCardGame\n");

        scan.close();
    }

    /**
     * Get the card, c, that player p wants to play pass c to the game, see if it
     * accepted c from p if game didn't accept the card, give c back to the player!
     * return accepted.
     * 
     * @param p
     * @param game
     * @return boolean
     */
    private static boolean play(Player p, CardGame game) {
        Card c;
        boolean accepted;

        accepted = false;
        c = p.playCard();
        if (game.playTurn(p, c)) {

            accepted = true;
        }

        else {
            accepted = false;
            System.out.println("Its not your turn");
            p.add(c);
        }

        return accepted;
    }

} // end class MyCardGame
