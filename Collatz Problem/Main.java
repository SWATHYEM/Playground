import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=n;
       int c=0;
        System.out.println(a);
        while(n!=1)
        {
           
             if(n%2==0)
             { 
               c++;
               n=n/2;
             }
              else
              {
                c++;
                n=(3*n)+1;
              }
           
           System.out.println(n);
        }
      System.out.println(c);
     
    }
}

            
