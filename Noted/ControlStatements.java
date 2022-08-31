import java.util.Scanner;
/**
 * Write a description of class ControlStatements here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ControlStatements
{
    public static String grade(int percentage){
        /*
         * if (critera{
         *      what it does when true  
               }
         */
        if (percentage >= 90){
            return "A";
        } else if (percentage >= 80 && percentage < 90) {
            return "B";
        } else if (percentage >= 70){
            return "C";
        } else if (percentage >= 60){
            return "D";
        }
        return "F";
    }
    public static void gradeThis(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what score did you get");
        int perct = scanner.nextInt();
        //String grade = grade(perct); This works as does the bottom
        System.out.println("You got a " + grade(perct));
    }
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            gradeThis();
        }
    }
    public static void main2(String[] args){
        for (int i = 0; i < 5; ){
            gradeThis();
            i++;
        }
    }
    public static void loops(){
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        while (true){
            System.out.println(i);
            i++;
            System.out.println("Dont run this");
        }
    }
}
