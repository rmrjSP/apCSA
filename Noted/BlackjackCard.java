import java.util.Scanner;
import java.lang.Math;
/**
 * Write a descriptionof class Blackjack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackjackCard
{
    // instance variables - replace the example below with your own
    static Scanner scanner = new Scanner(System.in);
    static int playerTotal;
    private int cardTotal;
    
    /**
     * Constructor for objects of class Blackjack
     */
    public BlackjackCard()
    {
        int total = ((int)(Math.random() * 8) + 2);
        cardTotal = total;
    }

    public int getCardTotal(){
        return cardTotal;
    }

    public static int playerHand(){

        BlackjackCard card = new BlackjackCard();
        int firstCard = card.getCardTotal();
        System.out.println("You got a " + firstCard);
        BlackjackCard card2 = new BlackjackCard();
        int secondCard = card2.getCardTotal();
        System.out.println("You got a " + secondCard);
        int playerInitialTotal = firstCard + secondCard;    
        System.out.println("Your total is " + playerInitialTotal); 
        
        return playerInitialTotal;
        playerInitialTotal = playerTotal;
    }

    public static int dealerHand(){

        BlackjackCard card = new BlackjackCard();
        int firstCard = card.getCardTotal();
        System.out.println("Dealer got a " + firstCard);
        BlackjackCard card2 = new BlackjackCard();
        int secondCard = card2.getCardTotal();
        System.out.println("Dealers second card is hidden");
        int dealerInitialTotal = firstCard + secondCard;    
        return dealerInitialTotal;
    }

    public static void playerTurn(){
        int playerHand = playerTotal;
        int answer = 0;
        while(playerHand < 22 && answer != 2){
            System.out.println("Would you like to hit");
            System.out.println("Type 1 for yes, 2 for No");
            answer = scanner.nextInt();
            if(answer < 2){
                BlackjackCard card = new BlackjackCard();
                int newCard = card.getCardTotal();
                System.out.println("You got a " + newCard);
                
            }
        }
    }


}
