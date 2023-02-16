/**
 * Write a description of class Sorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorting
{
    int arr[] = arr = new int[6];
    public Sorting(){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10 +1);
        }
    }

    public void bubbleSort(){
        int holder = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr.length -1; j++){
                if(arr[j] > arr[j+1]){
                    holder = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = holder;
                }

            }
        }
        for( int h : arr){
            System.out.print(h + " ");
        }
    }

    public void selectionSort(){
        int holder = 0;
        for(int i = arr.length -1; i >= 0; i--){
            int index = i;
            for(int j =arr.length -1 ; j >= 0; j--){
                if(arr[j] < arr[index]){
                    index = j;
                }
                holder = arr[index];
                arr[index] = arr[i];
                arr[i] = holder;

            }
        }
        for( int h : arr){
            System.out.print(h + " ");
        }
    }

    public void insertionSort(){
        int   holder =0;
        for(int i =0; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    holder = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = holder;
                }
            }
        }
        for( int h : arr){
            System.out.print(h + " ");
        }
    }
}