import java.util.ArrayList;

public class DiscardPile{
    ArrayList<Card> pile = new ArrayList<Card>();
    
    public String top(){
        return pile.get(pile.size()).toString();
    }
    public Card topCard(){
        return pile.get(pile.size());
    }
    public void add(Card c)
    {
        pile.add(c);
    }
}