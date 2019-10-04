#include <stdio.h>
int main()
{
	int i,num;
    int sum=0;
    scanf("%d",&num);
    for(i=1;i<=num;i+=1)
    {
       sum=sum+i;
    }
       printf("%d",sum);
    
	return 0;
}