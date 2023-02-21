
/**
 * Write a description of class Gandasa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gandasa extends Melee implements WeaponInterface
{
    boolean sharp;
    int damage = 0;

    public Gandasa(String name, double weigth, double length, boolean sharp){
        super(name, weigth, length);
        this.sharp = sharp;
    }

    public int heavyOverhead(){
        damage += 20;
        return damage;
    }

    public boolean getSharp(){
        return sharp;
    }

    public int attack(String attackType){
        
        if(attackType.equals("slash")){
            damage += 20;
        } else if (attackType.equals("stab")){
            damage += 0;
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
