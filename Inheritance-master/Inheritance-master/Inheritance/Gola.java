
/**
 * Write a description of class Gola here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gola extends Melee implements WeaponInterface
{
    
    int damage = 0;

    public Gola(String name, double weigth, double length){
        super(name, weigth, length);
        
    }

    public int wrapAroundArm(){
        damage += 20;
        return damage;
    }

   

    public int attack(String attackType){
        
        if(attackType.equals("smash")){
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
