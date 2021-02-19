package cardgame;

import java.util.ArrayList;

// Cardgame
// author:
// date:
public class CardGame
{
    // properties
    Cards             fullPack;
    ArrayList<Player> players;
    ScoreCard         scoreCard;
    Cards[]           cardsOnTable;
    int               roundNo;
    int               turnOfPlayer;
    
    // constructors
    public CardGame( Player p1, Player p2, Player p3, Player p4)
    {
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
    }
    
    // methods
    public boolean playTurn( Player p, Card c)
    {
        cardsOnTable.add(p.playCard());
        return false;
    }
    
    public boolean isTurnOf( Player p)
    {
        // ToDo
        return false;
    }
    
    public boolean isGameOver()
    {
        // ToDo
        return false;
    }
    
    public int getScore( int playerNumber)
    {
        // ToDo
        return -1;
    }
    
    public String getName( int playerNumber)
    {

        return players.get(playerNumber).getName();
    }
    
    public int getRoundNo()
    {
        return roundNo;
    }
    
    public int getTurnOfPlayerNo()
    {
        return turnOfPlayer;
    }
    
    public Player[] getWinners()
    {
        // ToDo
        return null;
    }
    
    public String showScoreCard()
    {
        return scoreCard.toString();
    }
    
}