import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=3;
       int  b=3;
       int d=1;
       
        System.out.print(a);
       for(int i=2;i<=n;i++)
       {
         a=a*b;
         System.out.print(" "+a);
         d++;
       
         
         
       }
    }
    }