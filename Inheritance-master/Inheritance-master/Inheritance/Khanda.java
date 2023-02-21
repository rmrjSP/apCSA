
/**
 * Write a description of class Khanda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Khanda extends Melee implements WeaponInterface
{
    boolean sharp;
    int damage = 0;

    public Khanda(String name, double weigth, double length, boolean sharp){
        super(name, weigth, length);
        this.sharp = sharp;
    }

    public int hoolSlashCombo(){
        damage += 25;
        return damage;
    }

    public boolean getSharp(){
        return sharp;
    }

    public int attack(String attackType){
        
        if(attackType.equals("slash")){
            damage += 15;
        } else if (attackType.equals("stab")){
            damage += 15;
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
