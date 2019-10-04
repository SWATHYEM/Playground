#include<stdio.h>
int sum(int num)
 {
   int nsum=(num*(num+1))/2;
   return nsum;
 }
int main() 
{
    int an,num;
    scanf("%d",&num);
    an=sum(num);
    printf("%d",an);
  	return 0;
}