import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       String str=s.nextLine();
        float t=s.nextFloat();
        float b=s.nextFloat();
        float h=s.nextFloat();
        float total=0;
      if(str.equalsIgnoreCase("MSDS"))
         {
             total=t+b;
             System.out.printf("%.2f",total);
         }
           else if(str.equalsIgnoreCase("MSH"))
              {
                 total=t+h;
                System.out.printf("%.2f",total);
              }
              else if(str.equalsIgnoreCase("MGSDS"))
              {
                total= (150*t)/100+b;
                System.out.printf("%.2f",total);
                
              }
             else 
                 {
                   total=(150*t)/100+h;  
                  System.out.printf("%.2f",total);
              }
              }
       }