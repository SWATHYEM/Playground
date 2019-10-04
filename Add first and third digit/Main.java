#include<stdio.h>
int main()
{
   int num;
   int fd,ld;
   scanf("%d",&num);
   fd=num/100;
   ld=num%10;
   int sum=fd+ld;
   printf("%d",sum);
   return 0;
}
 