
/**
 * Write a description of class KeylessCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KeylessCar extends Car
{
    //Please note the the order is different here.
    //Try to keep consistent, but this is to show that it can be different

    /**
     * Constructor for objects of class KeylessCar
     */
    public KeylessCar(String name, String brand, int wheels)
    {
        super(name, wheels, brand);
    }

    public void start(){
        System.out.println("You push the button and the car starts");
    }
    @Override
    public void move(){
        super.move();
        System.out.println("Its nice not having a key....");
    }
    public void test(){
        System.out.println("This is a test ");
    }
}
