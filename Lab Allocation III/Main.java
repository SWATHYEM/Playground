import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       int c=s.nextInt();
      int d=s.nextInt();
      int count=0;
       if(d<a)
       { 
         count++;
       }
     if(d<b)
      {
        count++;
      }
      
       if(d<c)
        {
         count++;
      
       }
      {
        System.out.println(count);
      }
      
    }
}