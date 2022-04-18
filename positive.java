import java.util.*;
class positive
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.print("Enter the numbers");
      if(n>=0)
      {
        System.out.println("The given number is positive");
        
      }
      else
      {
        System.out.println("The given number is negative");
      }
    }
  }