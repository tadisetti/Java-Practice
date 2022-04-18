import java.util.*;
class WeekSwitch
  {
    public static void main(String args[])
    {
      int n=2;

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the week day");
      n=sc.nextInt();
      switch(n)
      {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
      System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("wensday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("saturday");
        break;
        default:
        System.out.println("sunday");
    
        } 
          
        
    }
  }