import java.awt.Color;
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sword
{
    private String metal;
    private String type;
    private String owner;
    private double size;
    private Color scabbardColor;
    private int durability = 100;
    private int sharpness = 100;
    private int kills = 0;


    /**
     * Constructor for objects of class Sword
     */
    public Sword(String metal, String type,
    String owner, double size, Color scabbardColor)
    {
        this.metal = metal;
        this.type = type;
        this.owner = owner;
        this.size = size;
        this.scabbardColor = scabbardColor;
       
    }
    public Sword(){
        metal = "damascus steel";
        type = "saif";
        owner = "you";
        size = 3.0;
        scabbardColor = new Color(192, 192, 192);
    }
    
     public String getMetal(){
        return metal;
    }
     public String getType(){
        return type;
    }
     public String getOwner(){
        return owner;
    }
     public double getSize(){
        return size;
    }
    public Color getScabbardColor(){
        return scabbardColor;
    }
    
    
    public void setMetal(String newMetal){
        metal = newMetal;
    }
    public void setType(String newType){
        type = newType;
    }
    public void setOwner(String newOwner){
        owner = newOwner;
    }
    public void setSize(double newSize){
        size = newSize;
    }
    public void setColor(Color newScabbardColor){
        scabbardColor = newScabbardColor;
    }
    
    public void breakSword(){
        durability = 0;
        System.out.println("It broke");
    }
    public void dullSword(){
        sharpness = 0;
        System.out.println("It's dull");
    }
    public void gotKill(){
        kills--;
        System.out.println("You got a kill");
    }
}
