import java.util.*;
class Eligiblevoting
  {
    public static void main(String args[])
    {
      int  age;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter age");
      age=sc.nextInt();
      if(age>18)
      {
        System.out.println("Your eligible for voting");
        
      }
      else
      {
        System.out.println("Your not eligible for voting");
      }
    }
  }