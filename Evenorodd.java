import java.util.*;
class Evenorodd
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.print("Enter the numbers");
      if(n%2==0)
      {
        System.out.println("The given number is even");
        
      }
      else
      {
        System.out.println("The given number is odd");
      }
    }
  }