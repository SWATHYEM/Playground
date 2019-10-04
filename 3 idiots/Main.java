import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    float a=s.nextInt();
    float b=s.nextInt();
     float c=s.nextInt();
      float d=s.nextInt();
    float q=(a+c)/2;
    float r=(b+d)/2;
    System.out.printf("Binoy's house is located at (%.1f,%.1f)",q,r);
  }
}