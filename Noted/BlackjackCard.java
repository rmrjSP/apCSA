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
    static int dealerTotal;
    static int betTotal;
    /**
     * Constructor for objects of class Blackjack
     */
    public BlackjackCard()
    {
        int total = ((int)(Math.random() * 8) + 2);
        cardTotal = total;
    }
    public static void getBet(){
    System.out.println("How much do you want to bet? You can choose to not gamble like a responsible person.");
    int bet = 0;
    bet = scanner.nextInt();
    betTotal += bet;
    
    }

    public int getCardTotal(){
        return cardTotal;
    }
    public static int getPlayerTotal(){
        return playerTotal;
    }
    public static int getDealerTotal(){
        return dealerTotal;
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
        playerTotal += playerInitialTotal;
        
        return playerInitialTotal;
        
    }

    public static int dealerHand(){

        BlackjackCard card = new BlackjackCard();
        int firstCard = card.getCardTotal();
        System.out.println("Dealer got a " + firstCard);
        BlackjackCard card2 = new BlackjackCard();
        int secondCard = card2.getCardTotal();
        System.out.println("Dealers second card is hidden");
        int dealerInitialTotal = firstCard + secondCard;
        dealerTotal += dealerInitialTotal;
        return dealerInitialTotal;
    }

    public static void playerTurn(){
        
        int answer = 0;
        while(playerTotal < 22 && answer != 2){
            System.out.println("Would you like to hit");
            System.out.println("Type 1 for yes, 2 for No");
            answer = scanner.nextInt();
            if(answer < 2){
                BlackjackCard card = new BlackjackCard();
                int newCard = card.getCardTotal();
                System.out.println("You got a " + newCard);
                playerTotal += newCard;
                System.out.println("Your total is "  + playerTotal);
            } else{
                System.out.println("Its the dealer turn now");
                dealerTurn();
            }
            if(playerTotal > 22){
                System.out.println("You busted");
                System.out.println("You Lost");
            }
        }
    }
    
    public static void dealerTurn(){
        
        while(dealerTotal < 17){
            BlackjackCard card = new BlackjackCard();
            int newCard = card.getCardTotal();
            
            System.out.println("Dealer got a " + newCard);
            dealerTotal += newCard;
            if(dealerTotal > 22){
                System.out.println("dealer busted");
                System.out.println("You won");
            } 
        }
        if(playerTotal > dealerTotal && dealerTotal < 22){
                    System.out.println("Player Won");
                    int won = betTotal * 2;
                    System.out.println("You won " + betTotal);
                } else{
                    System.out.println("Dealer Won");
                    System.out.println("Dealer Total was " + dealerTotal);
                    int lost = betTotal;
                    System.out.println("You lost " + lost + " Bozo");
                    System.out.println("Have you ever thought of your family?, you're out here losing money as they can't even eat dinner everyday. A person like you is a waste of oxygen.");
                }
    }
    public static void play(){
        getBet();
        playerHand();
        dealerHand();
        playerTurn();
    }
    


}
