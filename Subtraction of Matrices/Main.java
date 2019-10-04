

#include<stdio.h>
void main()
{
  int a[20][20],b[20][20],sub[20][20];
  int n,i,j;
  scanf("%d",&n);
   int m;
   scanf("%d",&m);
  
   for(int i=0;i<=n-1;i++)
   {
    for(int j=0;j<=m-1;j++)
    {
      scanf("%d",&a[i][j]);
  
    }
  }
  for(int i=0;i<=n-1;i++)
  {
    for(int j=0;j<=m-1;j++)
    {
      scanf("%d",&b[i][j]);
  
    }
  }
  
  for(int i=0;i<=n-1;i++)
  {
    for(int j=0;j<=m-1;j++)
    { 
       
      sub[i][j]=a[i][j]-b[i][j];
      
    }
    
    }
  
   for(int i=0;i<=n-1;i++)
  {
    for(int j=0;j<=m-1;j++)
    { 
      printf("%d ",sub[i][j]);
    }
    printf("\n");

  }
}