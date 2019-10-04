import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=b/2;
        int e=(d*a)-100;
        System.out.println("The profit obtained is Rs."+e);
       
	}
}