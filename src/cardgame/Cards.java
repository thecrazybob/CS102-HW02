package cardgame;

import java.util.Random;

/**
 * Cards - Maintains a collection of zero or more playing cards. Provides
 * facilities to create a full pack of 52 cards and to shuffle the cards.
 * 
 * @author Abdullah Riaz (22001296), Mohammed Sohail (22001513) and Mostafa
 *         Khaled (22001062)
 * @version 22/02/2021
 */
public class Cards {

    // constants
    final int NOOFCARDSINFULLPACK = 52;

    // properties
    Card[] cards;
    int valid; // number of cards currently in collection

    // constructor
    public Cards(boolean fullPack) {
        cards = new Card[NOOFCARDSINFULLPACK];
        valid = 0;

        if (fullPack)
            createFullPackOfCards();
    }

    // methods

    /**
     * Returns the top card in the deck
     * 
     * @return Card
     */
    public Card getTopCard() {
        Card tmp;

        if (valid <= 0)
            return null;
        else {
            valid--;
            tmp = cards[valid];
            cards[valid] = null;
            return tmp;
        }
    }

    /**
     * Adds a card to the deck
     * 
     * @param c
     * @return boolean
     */
    public boolean addTopCard(Card c) {
        if (valid < cards.length) {
            cards[valid] = c; // should this be cloned?
            valid++;
            return true;
        }
        return false;
    }

    /**
     * Creates a complete deck
     * 
     * @return void
     */
    private void createFullPackOfCards() {

        // Loop through each card
        for (int card = 0; card < 52; card++) {
            addTopCard(new Card(card));
        }

    }

    /**
     * Shuffles the deck
     * 
     * @return void
     */
    public void shuffle() {
        Random rand = new Random();

        for (int i = 0; i < cards.length; i++) {
            int randomIndexToSwap = rand.nextInt(cards.length);
            Card temp = cards[randomIndexToSwap];
            cards[randomIndexToSwap] = cards[i];
            cards[i] = temp;
        }

    }

} // end class Cards
