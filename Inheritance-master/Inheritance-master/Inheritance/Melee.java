
/**
 * Write a description of class Melee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Melee extends weapon
{
    double length;

    public Melee(String name, double weight, double length)
    {
        super(name, weight);
        this.length = length;

    }
    public void getFeel(){
        System.out.println("You take a practice swing");
    }
    public double length(){
      return length;
    }
}
