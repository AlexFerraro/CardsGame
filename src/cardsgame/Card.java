
package cardsgame;

public enum Card 
{
    Two("2", 2), Three("3", 3), Four("4", 4), Five("5", 5), Six("6", 6), 
    Seven("7", 7), Eight("8", 8), Nine("9", 9), Ten("10", 10), J("Jack", 11), 
    Q("Queen", 12), K("King", 13), A("Ace", 14);

    private final String name;
    private final int score;

    private Card(String name, int score) 
    {
        this.name = name;
        this.score = score;
    }

    public String getName() 
    {
        return name;
    }

    public int getScore() 
    {
        return score;
    }    
}
