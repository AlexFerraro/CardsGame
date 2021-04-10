
package cardsgame;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class DeckCards 
{
    private Card card;
    private Suit suit;
    private ImageIcon imageIco;

    public DeckCards(Card card, Suit suit, ImageIcon imageIco) {
        this.card = card;
        this.suit = suit;
        this.imageIco = imageIco;
    }
    
    public static DeckCards[] generatesDeck() throws IOException 
    {
        SecureRandom secureRandom = new SecureRandom();
        InputStream is = null;
        String path = null;
        int deckSize = Suit.values().length * Card.values().length;     
        DeckCards deckCards[] = new DeckCards[deckSize];
        int index = 0;

        for(Suit suit : Suit.values())
            for(Card card : Card.values())
            {
                path = "images/" + suit.getName() + card.getName() + ".png";             
                is = DeckCards.class
                        .getClassLoader()
                        .getResourceAsStream(path);
                
                deckCards[index++] = new DeckCards(card, suit,new ImageIcon(ImageIO.read(is)));
            }
               
        for(int first = 0; first < deckCards.length; first++) {
            int second = secureRandom.nextInt(deckSize);
            DeckCards DeckCardsHelper = deckCards[first];
            deckCards[first] = deckCards[second];
            deckCards[second] = DeckCardsHelper;
        }
        
        return deckCards;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Suit getSuit() 
    {
        return suit;
    }

    public void setSuit(Suit suit) 
    {
        this.suit = suit;
    }

    public ImageIcon getImageIco() 
    {
        return imageIco;
    }

    public void setImageIco(ImageIcon imageIco) 
    {
        imageIco = imageIco;
    }
}
