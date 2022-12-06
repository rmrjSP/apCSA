package pixLab.pixLab.classes;

package pixLab.pixLab.classes;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    public void keepBlue(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel =null;
        for(int column = 0; column < pixels.length; column ++){
            for(int row = 0; row < pixels[column].length; row ++){
                pixel = pixels[column][row];
                pixel.setRed(255-pixel.getRed());
                pixel.setGreen(255-pixel.getGreen());
                pixel.setBlue(255-pixel.getBlue());
            }
        }
    }

    public void grayscale(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel =null;
        for(int column = 0; column < pixels.length; column ++){
            for(int row = 0; row < pixels[column].length; row ++){
                pixel = pixels[column][row];
                int color =0;
                int avg =0;
                color +=pixel.getRed();
                color +=pixel.getGreen();
                color +=pixel.getBlue();
                avg = color/3;
                pixel.setColor(new Color(avg,avg,avg));
            }
        }

    }

    public void fixUnderWater(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel =null;
        for(int column = 0; column < pixels.length; column ++){
            for(int row = 0; row < pixels[column].length; row ++){
                pixel = pixels[column][row];
                pixel.setRed(pixel.getRed() *5);

            }
        }
    }

    public void mirrorVerticalRigthToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - col - 1];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    public void mirrorHorizontal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int h = pixels.length;
        for (int row = 0; row < h/2; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][h - row - 1];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    public void mirrorHorizontalBotToTop()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int h = pixels.length;
        for (int row = 0; row < h/2; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][h - 1- row];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    public void mirrorDiagonal(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int total = pixels.length;
        if(pixels[0].length < pixels.length){
            total = pixels[0].length;
        }
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {
                count++;
                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
        System.out.println(count);
    }

    public void mirrorArms(){
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel botPixel = null;
        for(int row = 155; row <191; row ++){
            for(int cols = 98; cols < 171; cols ++){
                topPixel = pixels[row][cols];
                botPixel = pixels[191 - row - 191][cols];
                botPixel.setColor(topPixel.getColor());
            }
        }

        for(int row = 155; row <191; row ++){
            for(int cols = 238; cols < 296; cols ++){
                topPixel = pixels[row][cols];
                botPixel = pixels[191 - row - 191][cols];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }

    public void amongUs(){
        int sus = 100;

    }

    public void mirrorGull(){
        int mirrorPoint = 350;
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        for (int row = 225; row > 332; row++){
            for ( int col = 219; col < mirrorPoint; col ++){
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
            }
        }
    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    public void copy2(Picture fromPic, 
    int startRow, int startCol, int endRow, int endCol, int toStartRow, int toStartCol )
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = startRow, toRow = toStartRow; 
        fromRow < endRow &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = startCol, toCol = toStartCol; 
            fromCol < endCol &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    public void createCollage2()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        Picture jenny = new Picture("jenny-red.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        this.copy(jenny, 345, 23);
        Picture flowerFixUnderwater = new Picture(flower1);
        flowerFixUnderwater.fixUnderWater();
        Picture jennyGrayScale = new Picture(jenny);
        jennyGrayScale.grayscale();
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        Picture jennyVertical = new Picture(jenny);
        jennyVertical.mirrorVertical();
        this.copy(flowerNoBlue,300,0);
        this.copy(jenny, 45, 230);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
    }

    public void edgeDetection2(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        Color bottomColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[row+1][col];
                bottomColor = rightPixel.getColor();
                if (topPixel.colorDistance(bottomColor) > 
                edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
    }

    public void edgeDetection3(int edgeDist)
    {
        Pixel[] pix = new Pixel[16];
        Color[] color = new Color[16];
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length ; row ++){
            for (int col = 0; col < pixels[0].length -2; col ++){
                pix[0] = pixels[row][col];
                pix[2] = pixels[row+1][col];
                pix[3] = pixels[row+2][col];
                pix[4] = pixels[row+2][col+1];
                pix[5] = pixels[row+2][col+2];
                pix[6] = pixels[row][col+2];
                pix[7] = pixels[row][col+1];
                pix[8] = pixels[row + 1][col+1];
                
                pix[9] = pixels[row-1][col];
                pix[10] = pixels[row-2][col];
                pix[11] = pixels[row-2][col-1];
                pix[12] = pixels[row-2][col-2];
                pix[13] = pixels[row][col-2];
                pix[14] = pixels[row][col-1];
                pix[15] = pixels[row - 1][col-1];
                for( int i = 0; i < pix.length; i++){
                  color[i] = pix[i].getColor();
                }
                int num = 0;
                for(int j = 0; j < pix.length; j++){
                boolean thing = pix[0].colorDistance(pix[j].getColor())> edgeDist;
                if(thing){
                num++;
                }
                }
                if(num > 12){
                pix[0].setColor(Color.BLACK);
                
                } else{
                pix[0].setColor(Color.White);
                }
            }
        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
