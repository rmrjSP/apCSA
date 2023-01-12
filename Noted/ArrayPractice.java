import java.lang.Math;
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayPractice
{ 
    int[] arr;
    int[] testArr = {1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 3};

    public ArrayPractice(){
        arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10 +1);
        }
    }

    public void print(){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }

    public void removeIndex(int index){
        for(int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length -1] = 0;
    }

    public void AddNum(int num, int index){
        for(int i = 0; i < arr.length - (index +1); i++){
            arr[(arr.length - i)-1] = arr[(arr.length - i)-2];
        } 
        arr[index] = num;
    }

    public void removeAll(int num){
        
        for(int nums :  testArr){
            System.out.print(nums + " ");

        }
        System.out.println(" ");
        boolean intGone = false;
        while(!intGone){
            for(int i = 0; i < testArr.length; i++){

                if( testArr[i] == num){
                    testArr[i ] = testArr[i  + 1];
                }
                if( isNumPresent(num) == 0){
                    intGone = true;
                }
            }
        }
        for(int nums :  testArr){
            System.out.print(nums + " ");
        }
    }
    
    public void removeAll2(int num){
        int[] testArr = {1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 3};
        for(int nums :  testArr){
            System.out.print(nums + " ");

        }
        System.out.println(" ");

        for(int i = 0; i < testArr.length; i++){
            if( testArr[i] == num) {
                removeIndex(i);
                if(testArr[i] == num){
                    i--;
                }
            }
        }
        for(int nums :  testArr){
            System.out.print(nums + " ");
        }
    }

    public int isNumPresent(int num){

        int count = 0;
        for(int i = 0; i < testArr.length; i ++){
            if(testArr[i] == num){
                count ++;
            }
        }
        return count;
    }
}
