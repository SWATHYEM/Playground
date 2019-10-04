import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       int a=6;
       int j=5;
       int k=1;
       System.out.print(a);
      
      for(int i=2;i<=n;i++)
      {
        a=a+(k*j);
        k++;
        System.out.print(" "+a);
      }
        
        
        
     
    }
}