import java.util.Scanner;
/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class runner
{
    Scanner scanner = new Scanner(System.in);
 
    public void customizePlayer(){
        System.out.println("Do you want to customize your charcter");
        System.out.println("1 for yes, 2 for no");
        int ans = scanner.nextInt();
        if(ans == 1){
            System.out.println("What type of charater do you want to be");
            System.out.println("1 for defensive, 2 for attacking, 3 for ranged");
            int ans2 = scanner.nextInt();
            if(ans2 == 1){
               runnerDefensive runnerDefensive = new runnerDefensive();
               runnerDefensive.run();
               
            } else if(ans2 == 2){
              runnerAttacking runnerAttacking = new runnerAttacking();
               runnerAttacking.run();
            } else if(ans2 == 3){
              runnerRanged runnerRanged = new runnerRanged();
               runnerRanged.run();
            }
        } else if(ans == 2){
            
        }
    }

   
}
