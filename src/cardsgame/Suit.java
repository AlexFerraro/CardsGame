
package cardsgame;

public enum Suit
{
    CLUBS("Clubs"), DIAMONDS("Diamonds"), HEARTS("Hearts"), SPADES("Spades");
    
    private final String name;

    private Suit(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    } 
}

