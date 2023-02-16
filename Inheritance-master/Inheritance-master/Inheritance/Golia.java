
/**
 * Write a description of class Golia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Golia extends Melee implements WeaponInterface
{
    boolean sharp;
    public Golia(String name, double weigth, double length, boolean sharp){
        super(name, weigth, length);
        this.sharp = sharp;
    }

    public void switchToBackHand(){
        System.out.println("You switch the sword down");
    }

    public boolean getSharp(){
        return sharp;
    }

    public int attack(String attackType){
        int damage = 0;
        if(attackType.equals("slash")){
            damage += 15;
        } else if (attackType.equals("stab")){
            damage += 10;
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
