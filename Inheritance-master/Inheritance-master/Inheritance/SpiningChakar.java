
/**
 * Write a description of class SpiningChakar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpiningChakar extends Defensive implements DefenseCommands
{
    int damage = 0;
     public SpiningChakar(String name, double weight, int durability){
        super(name, weight, durability);
        }
        
       public int Throw(){
        damage += 10;
        System.out.println("The enemy is trapped");
        return damage;
        
        }
    public boolean blocked(){
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
