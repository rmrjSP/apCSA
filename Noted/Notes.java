
/**
 * Basic Java Notes. This will include all of the basic notes that we use.
 *
 * @author Ramraj 
 * @version 8/22/22
 */
public class Notes
{
   public static void main(){
       System.out.print("Hello");
       System.out.print("World");
       System.out.println("!"); //Carriage return happens AFTER the line 
       System.out.print("Hello"); //Hello appears on the 2nd line
   }
    
   public static void method1(){
       System.out.print("a");
       System.out.println("b");
       System.out.print("c");
       System.out.println("d");
       System.out.print("e");
       System.out.println();
       System.out.println();
       System.out.println("Hello");
   }
   
   public static void method2(){
       System.out.println("This is a period - .");
       System.out.println("This is a forward slash - /");
       System.out.println("This is a backslash - \\");
       System.out.println("This is a qoutation mark - \"");
       // The backslash is used for escape characters
       
       System.out.println("This is on the first line. \nThis is on the second.");
       System.out.println("\tHere's a tab");
   }
   /*
   -Printing
   -Escape Charaters
   -Formatting
   -Commenting
   -Documentation
   */
  public static void method3(){
    practice2.testMethod2();
  }
  
  public static void method4(){
    practice2.testMethod2();
    System.out.println();
    practice2.testMethod2();
  }
  
  public static void method5(String name){
    System.out.println("Hello" + name + ".");
    //When you take strings and combine them, it is called...
    //Concatenation 
  }
  
  public static void variables(){
      String name; // This is a variable declaration
      //YOU MUST DECLARE ALL VARIABLE PRIOR TO USE!!!!
      
      name = "Homelander"; //This is the instantiation of the variable
      //This is where you actually set the variable
      
      String goodPerson = "Starlight";
      
      //data types
      //Things can be a primitive data type, or an Object.
      
      //Numbers
      int a = 2100000000; //integer - This is most common
      //int max is 2^31-1(about 2.1 billon)
      
      long b = 0;// max 2^63-1
      short c = 0;// max 2^15-1
      byte d = 127;// max 2^7-1(127), lowest -128
      
      System.out.println("this is 127 + 1");
      System.out.println((byte)(d + 1));
      
      //decimals
      double e = 0.0; //This is most common
      float f = 0.0f; //Yes, these exist.
      
      boolean g = false;
      
      char h = 'h'; //Only a single character. We dont use it.
      
      
      Integer i = 10;
      Boolean j = true;
      Double k = 0.0;
      //object versions
      
      
      
  }
  public static void method6(){
    int a = 9;
    int b= 2;
    
    System.out.println("this is 9 + 2");
    System.out.println(9 + 2);
    System.out.println();
    System.out.println("this is 9 - 2");
    System.out.println(9 - 2);
    System.out.println();
    System.out.println("this is 9 * 2");
    System.out.println(9 * 2);
    System.out.println();
    
    //9 is and int so is 2 so answer is is
    System.out.println("this is 9 / 2");
    System.out.println(9 / 2);// decimals dont get used
    System.out.println();
    
    System.out.println("this is 9 / 2");
    System.out.println(9. / 2);
    System.out.println();
    
    System.out.println("this is 9 / 2");
    System.out.println((double)9 / 2);
    System.out.println();
    
    //does not work
    System.out.println("this is 9 / 2");
    System.out.println((double)(9 / 2));
    System.out.println();
    
    }
    public static void method7(){
        //This number can never change.
        final double PI = 3.14; //Notice it is in all caps
        // PI += 1; I cant do this because PI is final
        
    }
    public static void weirdMath(){
    //Notice that I used two words for the name of ths method
    //We capitalize every first letter (its called camelcase)
    System.out.println(14 % 5);
    System.out.println();
    System.out.println();
    
    System.out.println("What does this do");
    System.out.println(13 % 12);
    System.out.println(5 % 2);
    System.out.println(150 % 3 == 0);  //Is 150 divisible by 3?
    
    //Powers 
    System.out.println("This is 2 to the 20th power");
    System.out.println(Math.pow(2, 20));
    
    }
}