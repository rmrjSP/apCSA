
/**
 * Write a description of class Charcter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Players
{
    String name;
    int age;
    public Players(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
       return name;
    }
    public int getAge(){
       return age;
    }
}
