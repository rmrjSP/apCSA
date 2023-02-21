
/**
 * Write a description of class ThrowingChakar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThrowingChakar extends Ranged implements RangedWeaponInterface
{
     int damage = 0;
   public ThrowingChakar(String name, double weight, double range){
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
    public int luanch(){
      damage = 10;
      return damage;
      
    }
}
