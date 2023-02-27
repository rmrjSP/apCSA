
/**
 * Write a description of class DoubleKirpan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleKirpan extends Melee implements WeaponInterface
{
    boolean sharp;
    int damage = 0;

    public DoubleKirpan(String name, double weigth, double length, boolean sharp){
        super(name, weigth, length);
        this.sharp = sharp;
    }

    public int LRLCombo(){
        damage += 30;
        return damage;
    }

    public boolean getSharp(){
        return sharp;
    }

    public int attack(String attackType){
        
        if(attackType.equals("slash")){
            damage += 25;
        } else if (attackType.equals("stab")){
            damage += 20;
        }
        return damage;
    }

    public boolean parry(){
        int total = ((int)(Math.random() + 0.5));
        return total == 1;
    }
}
