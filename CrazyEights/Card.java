public class Card{
    int num;
    int suit;      
    String suits;
    public Card(int n, int s)
    {
        suit = s;
        num = n;
    }   
    
    
        
    public String toString()
    {
        if (suit == 1){
            suits = "H";
        }
        else if (suit == 2)
        {
            suits = "D";
        }
        else if (suit == 3)
        {
            suits = "S";
        }
        else if (suit == 4)
        {
            suits = "C";
        }
        return  num + "" + suits;
    }
}