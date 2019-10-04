import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
      int cout=0;
    // int flag=0;
     while(a!=0)
     {
       a=a/10;
       //b=n/10;
       cout++;
     }
      
      //flag=1;
      //break;
      if(cout==3)
      {
        if(((a%100)/10)%3==0)
         {
            System.out.println("Trendy Number");
          }
          else
           {
          System.out.println("Not a Trendy Number");
          }
      }
      else
      {
         System.out.println("Not a Trendy Number");
      }
    }
}
      
  