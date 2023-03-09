import java.util.Scanner;
/**
 * Write a description of class JauhrETegh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JauhrETegh
{
    Scanner scanner = new Scanner(System.in);
   public void Jet(){
        //Trying to make a sports game based on a martial art I praticipate in
    int pPoints = 0;
    int ePoints = 0;
    int pFouls = 0;
    int eFouls = 0;
    int Sanjha = 0;
    int tenSecondWarnings = 0;
    boolean pHaveBlock = false;
    boolean eHaveBlock = false;
    outerloop:
    for(int i =0; i < 10; i++ ){
    System.out.println("Do you wish to attack or stay");
    System.out.println("one for attacking, 2 for stayting.");
    int pAns = scanner.nextInt();
    int eAns = ((int)(Math.random()*2 + 1.5));
    int pAttack = ((int)(Math.random()*10 + 1.5));
    int eBlock = ((int)(Math.random()*10 + 1.5));
    int eAttack = ((int)(Math.random()*10 + 1.5));
    int pBlock = ((int)(Math.random()*10 + 1.5));
    if(pFouls == 3){
    System.out.println("you fouled out cheeser");
    break outerloop;
    }
    if(eFouls == 3){
    System.out.println("your opponent fouled out");
    break outerloop;
    }
    if(Sanjha == 3){
    System.out.println("to many consecutive sanjhe, one foul is given");
    pFouls += 1;
    eFouls += 1;
    }
    if(tenSecondWarnings > 2){
    System.out.println("To many ten second warnings, one fouled is assesed");
    pFouls += 1;
    eFouls += 1;
    }
    if(pAns == 2 && eAns == 2){
    System.out.println("You both stand there, daman is getting angry and gives ten second warning.");
    tenSecondWarnings += 1;
    } 
    if(pAns == 1 && eAns == 1){
    System.out.println("Sanjha vaar, damans getting chessed again, one sanjha vaar waring is assesed.");
    Sanjha += 1;
    }
    if(pAns == 1 && eAns == 2){
       System.out.println("Where do you want to attack");
       System.out.println("1 for head, 2 for left arm, 3 for right arm, 4 for left bakhi, 5 for right bakhi, 6 for left leg, 7 for right leg, 8 for back");
       int attackSpot = scanner.nextInt();
       if(attackSpot == 1){
        if(pAttack >= 6 && !(eBlock >= 7) ){
        System.out.println("You got 2 points");
        pPoints += 2;
        }
        }
    }
    }
    }
}
