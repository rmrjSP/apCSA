
/**
 * Write a description of class Daang here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Daang extends Melee implements WeaponInterface
{
    int damage = 0;

    public Daang(String name, double weigth, double length ){
        super(name, weigth, length);
        
    }

    public int insideOutsideCombo(){
        damage += 20;
        return damage;
    }

   

    public int attack(String attackType){
        
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
