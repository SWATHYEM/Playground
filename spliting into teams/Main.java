import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  int c=a/b;
  int d=a%b;
  System.out.println("The number of students in each team is "+c+" and left out is "+d);
}
  
}