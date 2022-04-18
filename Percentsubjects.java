import java.util.*;
class Percentsubjects
  {
    public static void main(String []args)
    {
      float total;
      float percentage;
      float average;
      int sub_1=40,sub_2=50,sub_3=60,sub_4=70,sub_5=80;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the marks of 5 subjects");
      total=sub_1+sub_2+sub_3+sub_4+sub_5;
      average=total/5.0f;
      percentage=((total/500.0f)*100);
    
      System.out.println("The total marks is:"+total);
      System.out.println("The average marks is:"+average);
      System.out.println("The percentage marks is:"+percentage);
      
    
      
    }
  }