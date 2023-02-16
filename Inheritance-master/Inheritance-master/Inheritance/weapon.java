
/**
 * Write a description of class weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class weapon extends Item 
{
    double weigth;
  
    public weapon(String name, double weigth )
    {
       super(name); 
       this.weigth = weigth;
    }
    public void draw(){
       System.out.println("The weapon was drawn");
    }
    public double getWeigth(){
      return weigth;
    }
}
