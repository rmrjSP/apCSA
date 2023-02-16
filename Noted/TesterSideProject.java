import java.util.Scanner;
/**
 * Write a description of class TesterSideProject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterSideProject
{
    PlayerSideProject[] playerArray = new PlayerSideProject[3]; 
    
    public void allmightyCreator(){
     playerArray[0] = new PlayerSideProject("Jungveer", 15, "Fowler" ); 
    playerArray[1] = new PlayerSideProject("Manroop", 16, "Sanger" ); 
    playerArray[2] = new PlayerSideProject("Bhavan", 15, "Fowler");
    }
     public int getPerson(){
        int a = (int)(Math.random()*2 + 1);
        return a;
        }
    public void play(){
    int index = (int)(Math.random()*2 );
    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess name");
    String name = scanner.next();
    System.out.println("Guess age");
    int age = scanner.nextInt();
    System.out.println("Guess School");
    String school = scanner.next();
    if(name.equals(playerArray[index].getName())){
      System.out.println("Name Guessed Correctly");  
    } else{
      System.out.println("Name Guesses Incorrectly");
    }
    if(age == playerArray[index].getAge()){
      System.out.println("Age Guessed Correctly");  
    } else{
      System.out.println("Age Guesses Incorrectly");
    }
     if(school.equals(playerArray[index].getSchool())){
      System.out.println("School Guessed Correctly");  
    } else{
      System.out.println("School Guessed Incorrectly");
    }
   }
}
