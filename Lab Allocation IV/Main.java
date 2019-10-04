import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int l1=s.nextInt();
       int l2=s.nextInt();
       int l3=s.nextInt();
       int n=s.nextInt();
       int x=n-l1;
       int y=n-l2;
       int z=n-l3;
       if((x<y)&&(x<z))
       {
         System.out.println("L1");
       }
       else if((y<z)&&(y>x))
       {
         
       System.out.println("L2");
      
    }
     else
     {
       System.out.println("L3");
     }
      
      
    }
}