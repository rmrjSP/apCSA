import java.lang.Math;
import java.util.Scanner;
/**
 * Write a description of class GuessGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GuessGame
{
    public static String guessGame(){
        int num = (int)((Math.random()  * 10) + 1);
          Scanner scanner = new Scanner(System.in);
        System.out.println("what is your guess");
        for (int i = 0; i < 5; i++){
           
        int guess = scanner.nextInt();
        if (guess == num){
            System.out.println( "Game won");
            return "Game Won";
           }else if (guess > num){
               System.out.println("Guess is to high");
            }else if (guess < num){
               System.out.println("Guess is to Low");
            }
        }
        return "Game Lost";
    }
}
