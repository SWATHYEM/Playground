import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();
      int i,j;
       for(i=n;i>=1;i--)
       {
         for(j=1;j<2*i;j++)
         {
           System.out.print(j+" ");
           
	     }
        
          System.out.println();
     }
    }
}