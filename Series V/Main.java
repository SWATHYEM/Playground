import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int b=11;
       int a=0;
       for(int i=0;i<n;i++)
       {
         a=b*b;
         System.out.print(a+" ");
         
         b=b+4;
       
       }
	}
}