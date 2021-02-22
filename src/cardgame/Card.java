package cardgame;

/**
 * Card - a single playing card
 * 
 * @author Abdullah Riaz (22001296), Mohammed Sohail (22001513) and Mostafa
 *         Khaled (22001062)
 * @version 22/02/2021
 */

public class Card {

    // constants
    final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs" };
    final String[] FACES = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

    final int NOOFCARDSINSUIT = 13;

    // properties
    int cardNo;

    // constructors

    /**
     * Constructor using faceValue and suit index as input
     */
    public Card(int faceValue, int suit) {
        cardNo = faceValue + suit * NOOFCARDSINSUIT;
    }

    /**
     * Constructor using cardNumber as input
     */
    public Card(int cardNumber) {
        cardNo = cardNumber;
    }

    // methods
    
    /**
     * Returns the card number
     * 
     * @return int
     */
    public int getCardNo() {
        return this.cardNo;
    }

    /**
     * Returns the face value of the card
     * 
     * @return int
     */
    public int getFaceValue() {
        return cardNo % NOOFCARDSINSUIT;
    }

    /**
     * Returns the suit of the card
     * 
     * @return int
     */
    public int getSuit() {
        return cardNo / NOOFCARDSINSUIT;
    }

    /**
     * Returns the string representation of the card
     * 
     * @return String
     */
    public String toString() {
        return FACES[getFaceValue()] + " of " + SUITS[getSuit()];
    }

    /**
     * Determines if two cards are equal and returns the result
     * 
     * @param c
     * @return boolean
     */
    public boolean equals(Card c) {

        if (this.getFaceValue() == c.getFaceValue() && this.getSuit() == c.getSuit()) {
            return true;
        }

        else {
            return false;
        }

    }

    /**
     * Compares the current card with the input card
     * 
     * @param c
     * @return int
     */
    public int compareTo(Card c) {

        if (this.cardNo == c.cardNo) {
            return 0;
        }

        else {
            return this.cardNo > c.cardNo ? 1 : -1;
        }

    }

}