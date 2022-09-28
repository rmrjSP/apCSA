
/**
 * Write a description of class StringCheckerRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringCheckerRunner

{
    public static void main(){
        StringChecker sc1 = new CodeWordChecker( 5, 8, "$");
        StringChecker sc2 = new CodeWordChecker("pass");
        System.out.println(sc1.isValid("happy"));
        System.out.println(sc2.isValid("MyPass"));
    }
}
