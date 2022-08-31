
/**
 * Write a description of class LoopPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopPractice
{
    public static void practice2(){
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void practice1(){
        for(int i = 1; i <= 5; i++){
          System.out.println("1 2 3 4 5");
        }
    }
    public static void practice3(){
          for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
