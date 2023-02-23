
/**
 * Write a description of class Attacking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AttackingPlayer extends Players
{
    int defense;
   int attack;
   int ranged;
   public AttackingPlayer(String name, int age, int defense, int attack, int ranged){
    super(name, age);
    this.defense = defense;
    this.attack = attack;
    this.ranged = ranged;
    }
    public void AttackBoost(){
    attack += 10;
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
}
