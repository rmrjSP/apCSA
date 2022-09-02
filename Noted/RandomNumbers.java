import java.lang.Math;
/**
 * Write a description of class RandomNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomNumbers
{
   public static void main(){
       //Random number between [0,1)
       double num = Math.random();
       System.out.println(num);
       
       //Random number between [0,10)
       int num2 = (int)(Math.random() * 10);
       System.out.println(num2);
       
       //Random number between [44,100]
       int num3 = (int)((Math.random() * 57) + 44);//There are 57 different possibilities 
       System.out.println(num3);
       
       //Random number between [156, 648]
       int num4 = (int)((Math.random() * 473) + 156);//There are 57 different possibilities 
       System.out.println(num4);
    }
}
