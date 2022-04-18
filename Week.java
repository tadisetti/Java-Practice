import java.util.*;
class Week
  {
    public static void main(String args[])
    {
      int n=2;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the week day");
      n=sc.nextInt();
      if(n==1)
        System.out.println("Monday");
    else if (n==2)
      System.out.println("Tuesday");
      else if(n==3)
        System.out.println("wensday");
      else if(n==4)
        System.out.println("thursday");
      else if(n==5)
        System.out.println("Friday");
      else if(n==6)
        System.out.println("saturday");
      else
        System.out.println("sunday");
    }
  }