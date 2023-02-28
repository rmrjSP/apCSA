
/**
 * Write a description of class Defending here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefendingPlayer extends Players
{
   int defense;
   int attack;
   int ranged;
   public DefendingPlayer(String name, int age, int defense, int attack, int ranged){
    super(name, age);
    this.defense = defense;
    this.attack = attack;
    this.ranged = ranged;
    }
    public void DefenseBoost(){
    defense = defense + 10;
    }
    public String getName(){
       return name;
    }
    public int getAge(){
       return age;
    }
    public int getDefense(){
       return defense;
    }
    public int getAttack(){
       return attack;
    }
    public int getRanged(){
    return ranged;
    }
        public void setDefense(int inc){
    defense += inc;
    }
    public void setAttack(int inc){
    attack += inc;
    }
    public void setRanged(int inc){
    ranged += inc;
    }
}


