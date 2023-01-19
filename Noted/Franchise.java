
/**
 * Write a description of class Franchise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Franchise
{
    private int cost;
    private int numberOfCustomers;
    private double revenue;
    private boolean isProfitable;
    
    public Franchise(){
        numberOfCustomers = 0;
        revenue = 0;
        isProfitable = false;
        cost = 100000;
    }
    public int getCost(){return cost;}
    public int numberOfCostumers(){return numberOfCustomers;}
    public double getRevenue(){return revenue;}
    public boolean isProfitable(){return isProfitable;}
}
