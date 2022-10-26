
/**
 * Write a description of class ArraysOfTheSecondDemension here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraysOfTheSecondDemension
{
    int[] arr;
    int[][] arr2;
    int[][] arr3;
    int[] pixel;
    int[][][] picture;
    int[][][][][][][][][][] tenDArray;
    public ArraysOfTheSecondDemension(){
        arr = new int[10];
        arr2 = new int [10][10];
        arr3 = new int[3][5];
        pixel = new int[3];
        tenDArray = new int[5][5][5][5][5][5][5][5][5][5];
    }

    /**
     * Fills the array arr with number staring at 1
     */
    public void fillArr(){
        int count = 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = count;
            count++;
        }
    }

    /**
     * Fills the array arr with number staring at 1
     */
    public void fillArr2(){
        int count = 1;

        //Row=Major format
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                arr2[i][j] = count;
                count++;
            }

        }
    }

    public void fillArr3(){
        int count = 1;

        //Row=Major format
        //arr3.length is # of rows
        //arr[0].length is number of columns ( or length of rows)
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[0].length; j++){
                arr3[i][j] = count;
                count++;
            }

        }
    }

    public void print2DArray(){
        int count = 1;
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[0].length; j++){

                System.out.print(arr2[i][j] + " ");

            }
            System.out.println();
        }
    }

    public void betterPrint(){
        for(int [] row: arr2){
            for(int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
