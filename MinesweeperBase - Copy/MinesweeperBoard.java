
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
    Cell[][] board;
    int rows;
    int columns;

    public MinesweeperBoard(int row, int col ){
        //Put the constructor here.
        board = new Cell[row][col];
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
        int numMines = 0;
        while( numMines < mines){
        for(int i = 0; i < mines; i++){
            int mineCell = (int)(Math.random() * (rows*columns));
            board[(int)(Math.random() * (rows))][(int)(Math.random() * (columns))].setMine();
            numMines++;
        }
    }
    }
   
    public void addNums(){
        for(int i =0 ; i < board.length; i++){
            for(int j = 0; j< board[i].length; j++){
            int count = 0;
            if(!board[i][j].isMine()){
                if(j+1 < rows*columns && j%board[i].length != board[i].length - 1 && board[i][j+1].isMine()){
                   count++; //Right
                }
                if(j - 1 >=0 && j%columns != 0 && board[i ][j-1].isMine()){
                    count++; //Left
                }
                if(i + 1 < board.length  && board[i + 1][j].isMine()){
                count++;//Down
                }
                if(i -1  >= 0 && board[i - 1][j].isMine()){
                count++;//Up
                }
                 if(i + 1  < board.length && j%board[i].length != 0 && board[i + 1][j-1].isMine()){
                count++;//DownLeft
                }
                 if(i + 1  < board.length && j%board[i].length  != board[i].length - 1 && board[i + 1][j+1].isMine()){
                count++;//DownRight
                }
                if(i -1  >= 0  && j%board[i].length != board[i].length - 1 && board[i - 1][j+1].isMine()){
                count++;//UpLeft
                }
                if(i -1 >= 0  && j%board[i].length  != 0 && board[i - 1][j-1].isMine()){
                count++;//UpRight
                }
             
                board[i][j].changeValue(count);
            }
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
                if(board[i][p].getValue() == 10){
                    System.out.print("X");
                }else{
                    System.out.print(board[i][p].getValue() );
                }
            }
            System.out.println("");
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows; i++){
            for(int j = 0; j < columns; j++){
            board[i][j]= new Cell(this);
            panel.add(board[i][j].getButton());
        }
        }
        return panel;
    }
}
