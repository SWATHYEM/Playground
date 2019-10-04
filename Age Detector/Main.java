import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       int age;
       if(b>a)
       {
         age=b-a;
         System.out.println(age);
       }
       if(b<a)
       {
         age=(100-a)+b;
         System.out.println(age);
       }
    
         
    }
}