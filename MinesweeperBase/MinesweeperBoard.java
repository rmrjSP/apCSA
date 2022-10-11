
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.lang.Math;
public class MinesweeperBoard{
    Cell[] board;
    int rows;
    int columns;

    public MinesweeperBoard(int row, int col ){
        //Put the constructor here.
        board = new Cell[row * col];
        rows = row;
        columns = col;

        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        addMines(20);
        addNums();
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard(){
        this(10,10);
    }

    public void addMines(int mines) {

        for(int i = 0; i < mines; i++){
            int mineCell = (int)(Math.random() * (rows*columns));
            board[mineCell].setMine();
        }

    }

    public void addNums(){
        for(int i =0 ; i < (rows*columns); i++){
            int count = 0;
            if(!board[i].isMine()){
                
                if(i+1 < rows*columns && i%columns-1 != 0 && i%rows != 0 && board[i + 1].isMine()){
                    count++; //Right
                }
                if(i - 1 >=0 && i%columns != 0 && board[i - 1].isMine()){
                    count++; //Left
                }
                if(i + rows < (rows*columns) && i%rows != 0 && board[i + rows].isMine()){
                count++;//Down
                }
                if(i -rows >= 0 && i%rows != 0 && board[i - rows].isMine()){
                count++;//Up
                }
                 if(i + rows -1 < (rows*columns) && i%rows != 0 && board[i + rows -1].isMine()){
                count++;//DownLeft
                }
                 if(i + rows +1 < (rows*columns) && i%rows != 0 && i%columns-1  != 0 && board[i + rows +1].isMine()){
                count++;//DownRight
                }
                if(i -rows +1 >= 0 && i%rows != 0 && i%columns  != 0 && board[i - rows +1].isMine()){
                count++;//UpLeft
                }
                if(i -rows -1 >= 0 && i%rows != 0 && i%columns-1  != 0 && board[i - rows-1].isMine()){
                count++;//UpRight
                }
                board[i].changeValue(count);
            }

        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        int i;
        int p;
        int c = -1;
        for( p = 0; p < columns; p++){
            for( i = 0; i < rows; i++){
                c++;
                if(board[c].getValue() == 10){
                    System.out.print("X");
                }else{
                    System.out.print(board[c].getValue() );
                }
            }
            System.out.println("");
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
            board[i]= new Cell();
            panel.add(board[i].getButton());

        }
        return panel;
    }
}
