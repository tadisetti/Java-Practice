import java.util.*;
class Leapyear
{
  public static void main(String args[])
  {
      int y;
      Scanner sc=new Scanner(System.in);
      y=sc.nextInt();
      System.out.print("Enter the year");
      if(y%4==0)
      {
        System.out.println("The given year is leapyear ");
        
      }
      else
      {
        System.out.println("The given year is not leapyear");
      }
    }
  }
  
