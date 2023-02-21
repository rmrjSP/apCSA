
/**
 * Write a description of class NagniBarsha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NagniBarsha extends Melee implements WeaponInterface
{
    boolean sharp;
    int damage = 0;

    public NagniBarsha(String name, double weigth, double length, boolean sharp){
        super(name, weigth, length);
        this.sharp = sharp;
    }

    public int backSideCombo(){
        damage += 25;
        return damage;
    }

    public boolean getSharp(){
        return sharp;
    }

    public int attack(String attackType){
        
        if(attackType.equals("slash")){
            damage += 5;
        } else if (attackType.equals("stab")){
            damage += 25;
        }
        return damage;
    }

    public boolean parry(){
        int total = ((int)(Math.random()));
        boolean parry;
        if(total == 1){
            parry = true;
        } else{
            parry = false;
        }
        return parry;
    }
}
