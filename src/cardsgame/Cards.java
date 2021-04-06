
package cardsgame;

public enum Cards 
{
    Two("2", 2), Three("3", 3), Four("4", 4), Five("5", 5), Six("6", 6), 
    Seven("7", 7), Eight("8", 8), Nine("9", 9), Ten("10", 10), J("Jack", 11), 
    Q("Queen", 12), K("King", 13), A("Ace", 14);

    private final String name;
    private final int spots;

    private Cards(String name, int spots) 
    {
        this.name = name;
        this.spots = spots;
    }

    public String getName() 
    {
        return name;
    }

    public int getSpots() 
    {
        return spots;
    }    
}
