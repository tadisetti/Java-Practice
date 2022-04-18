import java.util.*;
class Vowel
  {
    public static void main(String args[])
     char letter;
      Scanner sc=new Scanner(System.in);
    char char1=sc.next().charAt(0);
    switch (char1=='a')||(char1=='A')
           (char1=='e')||(char1=='E')
           (char1=='i')||(char1=='I')
           (char1=='o')||(char1=='O')
           (char1=='u')||(char1=='U')
      
    {
      case 1:
      System.out.println("The character is a vowel");
      break;
      case 2:  
      System.out.println("The character is a constants ");
      break;
      default;
    }
  }