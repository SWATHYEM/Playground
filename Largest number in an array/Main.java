#include<stdio.h>
int main()
{
  int n;
  int a[30];
  scanf("%d",&n);
  for(int i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  int large;
   if(a[0]<a[1])
   {
     large=a[0];
   }
   else
   {
     large=a[1];
     
   }
  for(int i=0;i<=n-1;i++)
  {
    if(large<a[i])
    {
      large=a[i];
    }
    
  }
    printf("%d",large);
  
  
  
  return 0;
}