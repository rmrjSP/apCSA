
/**
 * Write a description of class ArrayListTests here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTests
{
    //ArrayList containing int arrays
    ArrayList<int[]> test;
    
    //Array contain  ArrayLists (made up if integers)
    ArrayList<Integer>[] test1;
    
    //ArrayList containg BooleaN ArrayLists
    ArrayList<ArrayList<Boolean>> test2;
    
    //2D array 
    ArrayList<ArrayList<Scanner>>[][] test3;
    
    public static void thing(){
        String[] a = new String[5];
        ArrayList<Float> b = new ArrayList<Float>();
        ArrayList<String[]> c = new ArrayList<String[]>();
        
        //Get the first item from b
        Float bFirst = b.get(0);
        //Get the first item of a
        String aFirst = a[0];
        //Get the first item from c (what data type is it?)
        String[] cFirst = c.get(0); //It is a String Array
        
        
    }
}
