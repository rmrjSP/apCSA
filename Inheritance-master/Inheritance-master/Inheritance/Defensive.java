
/**
 * Write a description of class Defensive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Defensive extends weapon
{
    int durability;
    public Defensive(String name, double weight, int durability){
        super(name, weight);
        this.durability = durability;
    }

    public void brace(){
        System.out.println("You prepare for impact");
    }

    public int getDurability(){
        return durability;
    }
}
