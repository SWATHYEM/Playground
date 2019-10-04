import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=1;
      int flag=0;
        for(int i=1;i<=n/2;i++)
        {
          f=f*i;
          if(f==n)
          {
            flag=1;
          }
          
        }
      if(flag==1)
      {
         System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      }
}
  