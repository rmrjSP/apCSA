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
      for(int i = 0; i < arr.length - (index +1); i++){
        arr[i + index] = arr[(i + index) + 1];
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
        int[] testArr = {1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 3};
        for(int nums :  testArr){
     System.out.print(nums + " ");
     System.out.println(" ");
    }
    
        for(int i = 0; i < testArr.length -1; i++){
            if( testArr[i] == num){
            testArr[i] = testArr[i  + 1];
            }
        
        }
    
            for(int nums :  testArr){
     System.out.print(num + " ");
    }
    }
}
