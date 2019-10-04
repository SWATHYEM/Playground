import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       int y=s.nextInt();
       float z=s.nextFloat();
       float a=(x*y*z)/100;
       System.out.printf("%.2f",a);
    }
}