import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int l=s.nextInt();
       int b=s.nextInt();
       float r=s.nextFloat();
       int x=a*a;
       int y=l*b;
       double z=3.14*r*r;
       System.out.println(x);
      System.out.println(y);
      System.out.printf("%.3f",z);
    }
}