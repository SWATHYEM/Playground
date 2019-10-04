#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[20];
  for(int i=0;i<=n-1;i++)
   {
    scanf("%d",&a[i]);
   }
  int ser1;
  scanf("%d",&ser1);
  int ser2;
  scanf("%d",&ser2);
  int num1=-1;
  int num2=-1;
  for(int i=0;i<=n-1;i++)
  {
    if(ser1==a[i])
    { 
       num1=i;
    }
    if(ser2==a[i])
    {
      num2=i;
    }
  }  
  
  printf("%d\n",num1);
  printf("%d\n",num2);
  return 0;
}