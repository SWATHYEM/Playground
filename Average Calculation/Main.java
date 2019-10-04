import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      float n1=s.nextFloat();
      float n2=s.nextFloat();
      float n3=s.nextFloat();
      float n4=s.nextFloat();
      float n5=s.nextFloat();
      float sum=n1+n2+n3+n4+n5;
      float avg=sum/5;
      //System.out.printf(%sum);
      System.out.printf("%.2f",avg);
      
    }
}