
#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[20];

  for( int i=0;i<n;i++)
  { 
     scanf("%d",&a[i]);
  } 

   func(n,a);  // function call
  return 0;
}

void func(int n, int a[])
{
  for (int i=0;i<n;i++)
  {
    if (a[i]!=0)
       printf("%d ",a[i]);
    
  }
  
   
  int z_count=0;
  for(int i=0;i<n;i++)
  {
    if (a[i]==0)
    {
      z_count++; 
      printf("%d ",a[i]);
    }
  }
}

  
