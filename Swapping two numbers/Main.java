import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
           Scanner s=new Scanner(System.in);
           int a=s.nextInt();
          int b=s.nextInt();
          int temp=b;
          b=a;
          a=temp;
          System.out.println(a);
          System.out.println(b);
          
        }
}