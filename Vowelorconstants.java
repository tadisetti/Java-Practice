import java.util.*;
class Vowelorconstants
{
  public static void main(String args[])
  {
    char letter;
      Scanner sc=new Scanner(System.in);
    char char1=sc.next().charAt(0);
    if((char1=='a')||(char1=='e')||(char1=='i')||(char1=='o')||(char1=='u')||(char1=='A')||(char1=='E')||(char1=='I')||(char1=='O')||(char1=='U'))
    {
      System.out.println("The character is a vowel");
    }
    else
    {
      System.out.println("The character is a constants ");
    }
  }
}