
#include<stdio.h>
int pow(int b,int x)
  { 
    int temp=1;
    for(int i=1;i<=x;i++)
    {
      temp=temp*b;
    }
     return temp;
 }
int main()
{   int b,x;
    scanf("%d",&b);
    scanf("%d",&x);
    int an=pow(b,x);
    printf("%d",an);
    
}