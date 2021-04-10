
package cardsgame;

public class Player 
{
    private static final int IngameCardLimit = 5;
    private final String name;
    private final DeckCards[] handGame;
    private int score;

    public Player(String name, DeckCards[] handGame) 
    {
        this.name = name;
        this.handGame = handGame;
        
        score = 0;
    }

    public void sumScoreCards(Card firstCardParameter, Card secondCardParameter)
    {
        score = score + firstCardParameter.getScore() + secondCardParameter.getScore();
    }

    public String getName() 
    {
        return name;
    }

    public DeckCards[] getHandGame() 
    {
        return handGame;
    }

    public int getScore() 
    {
        return score;
    }

    public void setScore(int score) 
    {
        this.score = score;
    }
}
