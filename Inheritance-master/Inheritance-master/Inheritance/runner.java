
/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class runner
{
    DefendingPlayer X = new DefendingPlayer("X", 2135, 56, 43, 43);
    Backpack XBackpack = new Backpack();
    DoubleKirpan XDoubleKirpan = new DoubleKirpan(" XDoubleKirpan", 4.2, 3.0, true);
    public void run(){
    X.DefenseBoost();
    int d = X.getDefense();
    int a = X.getAttack();
    int r = X.getRanged();
    System.out.println("The stats are " + d + " " + a + " " + r);
    XBackpack.storeItem(XDoubleKirpan);
    }
}
