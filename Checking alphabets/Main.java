import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
         char c=s.nextLine().charAt(0);
         if((c=='a')||(c=='A')||(c=='i')||(c=='I')||(c=='E')||(c=='e')||(c=='E')||(c=='u')||(c=='U'))
         {
           System.out.println("Vowel");
         }
        else if(((c>='a')||(c>='A'))&&((c<='z')||(c<='Z')))
        {
          System.out.println("Consonant");
       }
      else
      {
          System.out.println("Not an alphabet");
      }
}
}