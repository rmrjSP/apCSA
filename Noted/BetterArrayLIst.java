
/**
 * Write a description of class ArrayList2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List; //Technically out-of-scope
import java.util.ArrayList;
public class BetterArrayList
{
    List<String> shoppingList;
    public BetterArrayList(){
        shoppingList = new ArrayList<String>();
    }

    public void addStuff(){
        shoppingList.add("eggs");
        shoppingList.add("oranges");
    }
    
    public void printFirstLetter(){
    for(String s : shoppingList){
     System.out.println(s.substring(0,1));
    }
    }
    public void addItem(String name){
     shoppingList.add(name);
    }
    public String changeFirstItem(){
    return  shoppingList.set(0, "EGGS");
    
    }
}
