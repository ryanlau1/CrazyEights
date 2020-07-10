import java.util.ArrayList;
import java.util.Collections;
public class Deck{   
    ArrayList<Card> cards = new ArrayList<Card>(52);
    public Deck()
    {        
        for (int x = 1; x < 14; x++){
            for (int y = 1; y <5; y++){                   
                cards.add(new Card(x,y));
            }
        }
        shuffle();
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);        
    }
    
    public Card draw()
    {
        Card a = cards.get(0);
        cards.remove(0);
        return a;
    }
}