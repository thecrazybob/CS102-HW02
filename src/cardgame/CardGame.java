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
        players = new ArrayList<Player>();
        fullPack = new Cards(true);
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        scoreCard = new ScoreCard(players.size());
        fullPack.shuffle();
        cardsOnTable = new Cards[0];
        roundNo = 0;
        turnOfPlayer = 0;
        for (int i = 0; i < players.size(); i++) {
            for(int j = 0; j < 13; j++) {
				players.get(i).add(fullPack.getTopCard());
            }
        }

        

    }
    
    // methods
    public boolean playTurn( Player p, Card c)
    {
        if (isGameOver() == true || isTurnOf(p) == true ) {
            return false;
        }
        
        cardsOnTable[turnOfPlayer].addTopCard(c);

        

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
        return scoreCard.getScore(playerNumber);
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