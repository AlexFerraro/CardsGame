
package cardsgame;

public class Player 
{
    private static final int IngameCardLimit = 5;
    private final String name;
    private String handGame[];
    private int spots;

    public Player(String name, String[] handGame, int spots) 
    {
        this.name = name;
        this.handGame = handGame;
        this.spots = spots;
    }

    public String getName() 
    {
        return name;
    }

    public String[] getHandGame() 
    {
        return handGame;
    }

    public void setHandGame(String[] handGame) 
    {
        this.handGame = handGame;
    }

    public int getSpots() 
    {
        return spots;
    }

    public void setSpots(int spots) 
    {
        this.spots = spots;
    }
}
