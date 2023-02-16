
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    int numberOfWheels;
    String brand;
    public Car(String name, int wheels, String brand)
    {
        super(name);
        this.brand = brand;
        numberOfWheels = wheels;
        System.out.println("The brand and wheels were assigned");
    }
    
    public void start(){
        System.out.println("You turn the key and " + name + " starts.");
    }
    @Override //A fancy way of saying that it overrides the abstract method
    //(Or another method that is already defined)
    public void park(){
        System.out.println("You lock the car on your way out");
    }
}
