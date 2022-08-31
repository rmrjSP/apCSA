public class practice2{
    public static void main(String[] args){
    System.out.println("Hello world");
  }
    public static void testMethod(){
        main(new String[0]);
  }
    public static void testMethod2(){
        testMethod();
  }
  //Make a for loop that prints the numbers 1 throught 1000
  public static void forLoopPractice(){
    for(int i = 1; i <= 1000; i++){
       System.out.println(i);
    }
    
    }
    public static void nestedForLoops(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void reverse(){
        for(int i = 5; i > 0; i--){
            for(int j = 1; j <= 5; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void triangle(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void reverseTriangle(){
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void practice1(){
    
    }
    
}