#include<stdio.h>
int main()
{
	int n;
    scanf("%d",&n);
       int val= 1;
      for(int a = 1 ; a <= n ; a++)
        {
         for(int space = 1 ; space <= n-a ; space++) 
         {
            printf(" ");
         }
            for(int b = 1; b <=a;b++)
           {
            printf("%d ",val);
             
             val++;
            }
           printf("\n");
         
    }
  return 0;
}