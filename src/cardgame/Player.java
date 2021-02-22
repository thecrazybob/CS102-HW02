package cardgame;

/**
 * Player - Simple card game player with name and hand of cards
 * 
 * @author Abdullah Riaz (22001296), Mohammed Sohail (22001513) and Mostafa
 *         Khaled (22001062)
 * @version 22/02/2021
 */

public class Player {

    // properties
    String name;
    Cards hand;

    // constructor
    public Player(String name) {
        this.name = name;
        hand = new Cards(false);
    }

    // methods

    /**
     * Returns the name of the user
     * 
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Adds the card to user's hand
     * 
     * @param c
     * @return void
     */
    public void add(Card c) {
        this.hand.addTopCard(c);
    }

    /**
     * Plays a card in the user's hand
     * 
     * @return Card
     */
    public Card playCard() {
        Card c = new Card(0);
        c = hand.getTopCard();
        return c;
    }

} // end class Player
