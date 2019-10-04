import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        if(m==100)
        {
          System.out.println("S");
        }
       if((m<=99)&&(m>=90))
       {
           System.out.println("A");   
       }
      if((m<=89)&&(m>=80))
       {
           System.out.println("B");   
        
       }
      if((m<=79)&&(m>=70))
       {
           System.out.println("C");   
       }
      if((m<=69)&&(m>=60))
       {
           System.out.println("D");   
       }
      if((m<=59)&&(m>=50))
       {
           System.out.println("E");   
       }
      if(m<50)
      {
        System.out.println("F");
      }
    }
}
    
  
         
         
         
