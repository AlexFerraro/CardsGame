
package cardsgame;

import java.security.SecureRandom;
import javax.swing.ImageIcon;

public class DeckCards 
{
    private Cards cards;
    private Suit suit;
    private static ImageIcon imageIco;
    private static SecureRandom secureRandom = new SecureRandom();

    public DeckCards(Cards cards, Suit suit, ImageIcon imageIco) 
    {
        this.cards = cards;
        this.suit = suit;
        this.imageIco = imageIco;
    }
    
    public static DeckCards[] generatesDeck() 
    {
        int deckSize = Suit.values().length * Cards.values().length;
        DeckCards deckCards[] = new DeckCards[deckSize];
        int idx = 0;

        for(Suit suit : Suit.values())
            for(Cards carta : Cards.values())
                deckCards[idx++] = new DeckCards(carta, suit, imageIco);
        
        for(int first = 0; first < deckCards.length; first++) {
            int second = secureRandom.nextInt(deckSize);
            DeckCards aux = deckCards[first];
            deckCards[first] = deckCards[second];
            deckCards[second] = aux;
        }
        
        return deckCards;
    }

    public Suit getSuit() 
    {
        return suit;
    }

    public void setSuit(Suit suit) 
    {
        this.suit = suit;
    }

    public static ImageIcon getImageIco() 
    {
        return imageIco;
    }

    public static void setImageIco(ImageIcon imageIco) 
    {
        DeckCards.imageIco = imageIco;
    }

    public static SecureRandom getSecureRandom() 
    {
        return secureRandom;
    }

    public static void setSecureRandom(SecureRandom secureRandom) 
    {
        DeckCards.secureRandom = secureRandom;
    } 
}
