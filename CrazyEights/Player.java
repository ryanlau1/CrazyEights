import java.util.ArrayList;
public class Player
{
    ArrayList<Card> hand = new ArrayList<Card>();
    Deck a = new Deck();
    public Player()
    {
        while (hand.size() < 7)
        {
            hand.add(a.draw());
        }   
    }
    public String b()
    {
        for (Card a: hand)
        {
            return a.toString();
        }
        return null;
    }
}