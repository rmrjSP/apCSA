
/**
 * Write a description of class McDonalds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class McDonalds
{
    ArrayList<Franchise> stores;
    public McDonalds(){
        /* Implementation not shown*/
    }

    public double getTotalRevenue(){
     double total = 0;
     for(Franchise f : stores){
        total += f.getRevenue();
        }
        return total;
    }
}
