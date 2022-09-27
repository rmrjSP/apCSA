
/**
 * Write a description of class fgSFHSZFGH here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class checker implements StringChecker
{
    private int min;
    private int max;
    private String non;
    public boolean CodeWordChecker(int min, int max, String non){
        this.min = min;
        this.max = max;
        this.non = non;
        String str = str;
        int length = str.length();
        
        if ( length < min || length > max){
            if ( str.indexOf(non) >= 0){
            return false;
            }
            return false;
        
        } else {
        return true;
        }
    }
}
