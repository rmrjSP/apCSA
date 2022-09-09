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
    
}
