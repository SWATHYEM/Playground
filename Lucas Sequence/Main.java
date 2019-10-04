import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a=0;
       int b=0;
       int c=1;
      int d;
       System.out.print(a);
       System.out.print(" "+b);
       System.out.print(" "+c);
   
       for(int i=3;i<n;i++)
       { 
         d=a+b+c;
         a=b;
         
         b=c;
         c=d;
         System.out.printf(" "+d);
       }
      
    }
}

         
        
          