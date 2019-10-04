import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
     // int a=s.nextInt();
      int a;
      float m=0.0f;
      int c=0;
      do
     {
        a=s.nextInt();
        if(a<0)
         {
           m=(float)(m-1);
       
        }
        else if(a%2==1)
        {
         m++;
         c++;
        } 
        else
        {
          m=(float)(m-0.5);
          
        }
      }while((a>0)&&(c!=3));
     System.out.println(m);
    }
}