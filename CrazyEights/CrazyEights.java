import java.util.Scanner;
import java.util.ArrayList;
public class CrazyEights
{       
    Scanner sc = new Scanner(System.in);
    public void main (String[] args)
    {
       Player Computer = new Player();
       Player p1 = new Player(); 
       DiscardPile d = new DiscardPile();
       boolean running = true;
       ArrayList<Card> discardable = new ArrayList<Card>();
       int discarded;
       while (running == true)
       {
           if (Computer.hand.size() == 0 || p1.hand.size() == 0)
           {
               System.out.println("Game over!");
               running = false;
            }
           discardable.clear();
           System.out.println("Computer is holding " + Computer.hand.size() + " cards");
           System.out.println("Your hand: " + p1.b());
           
           System.out.println("Discard Pile: " + d.top());
           
           for (Card a: p1.hand)
           {
               if (a.num == d.topCard().num || a.suit == d.topCard().suit)
               {
                   discardable.add(a);
               }
            }
           System.out.println("Which card do you want to discard:");
           for (int i = 1; i < (discardable.size() + 1); i++)
           {
               System.out.print(" " + i + ". " + discardable.get(i-1));
            }
           discarded = sc.nextInt();
           System.out.println("You discarded " + discardable.get(discarded -1));
           p1.hand.remove(discardable.get(discarded -1));           
           d.add(discardable.get(discarded -1));          
           
           discardable.clear();
           
           for (Card a: Computer.hand)
           {
               if (a.num == d.topCard().num || a.suit == d.topCard().suit)
               {
                   discardable.add(a);
               }
           }
           
           Computer.hand.remove(discardable.get(0));
           d.add(discardable.get(0));
           
           System.out.println("Computer discarded: " + discardable.get(0));
        }
    }
}