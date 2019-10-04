#include<stdio.h>
void main()
{
  int a[20][20],transp[20][20];
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
       transp[j][i]=a[i][j];
    }
  }
  
  
 
  
   for(int i=0;i<=m-1;i++)
  {
    for(int j=0;j<=n-1;j++)
    { 
      printf("%d ",transp[i][j]);
     if(j==n-1)
    printf("\n");
    }
  }
}  