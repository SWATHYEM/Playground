import java.util.Scanner;

 class Main
{
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		
		int n=ss.nextInt();	
		 int a=0,b=1;
		 
		for(int i=2;i<n;i++)
		{
		
		  int c=a+b;
		    a=b;
		    b=c;
          
        }
		 System.out.println(b);   
		 
		

}
}