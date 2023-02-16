
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(){
      Car yourCar = new Car("Your Car ", 3, "trash");
      Car myCar = new KeylessCar("Mr.Wiebe's Awesome Car of Awesome ","Ferrari", 4);
      yourCar.start();
      myCar.start();
      yourCar.move();
      myCar.move();
      //myCar.test(); Altough it is defined. the test() method is not defined for all Car objects
    }

    
   

}
