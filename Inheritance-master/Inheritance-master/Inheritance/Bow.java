
/**
 * Write a description of class Bow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bow extends Ranged implements RangedWeaponInterface
{
   int damage = 0;
   public Bow(String name, double weight, double range){
    super(name, weight, range);
    }
    public boolean hitOrNo(){
      int total = ((int)(Math.random()));
        boolean hit;
        if(total == 1){
            hit = true;
        } else{
            hit = false;
        }
        return hit;
    }
    public int fire(){
      damage = 15;
      return damage;
      
    }
}
