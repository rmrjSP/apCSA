
/**
 * Write a description of class Dhaal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dhaal extends Defensive implements DefenseCommands
{
    int damage = 0;
     public Dhaal(String name, double weight, int durability){
        super(name, weight, durability);
        }
        
       public int punch(){
        damage += 10;
        return damage;
        }
    public boolean blocked(){
        int total = ((int)(Math.random() + 0.5));
        return total == 1;
    }
}
