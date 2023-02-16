
/**
 * Write a description of class Ranged here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ranged extends weapon
{
    double range;
    public Ranged(String name, double weight, double range){
    super(name, weight);
    this.range = range;
    }
    public void testRange(){
     System.out.println("You fire off a projectile");
     
     
    }
    public double getRange(){
      return range;
    }
}
