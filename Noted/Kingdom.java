
/**
 * Write a description of class Kingdom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kingdom
{
    public static final double PI = 3.14159;
    
    public static void kingdomTester(){
        Crown crown = new Crown("gold", "round", 5, 4.3, null);
        crown.owner = "The king";
        Crown crown2 = new Crown("iron", "square", 0, 1.1, null);
        crown2.owner = "you";
        
    }
}
