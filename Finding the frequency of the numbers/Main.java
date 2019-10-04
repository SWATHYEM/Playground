#include<stdio.h>
void main()
{
    int k,n,i,j;
  scanf("%d",&n);
    scanf("%d",&k);
    int a[40];
   for(i=0;i<=n-1;i++)
   {
     scanf("%d",&a[i]);
   }
  int b[k];
  
  for(j=0;j<=k-1;j++)
  {
   b[j]=0;
  }
     for(i=0;i<=n-1;i++)
     {
       b[a[i]-1]++;
     }
     for(i=0;i<=k-1;i++)
     {
       printf("%d %d\n",( i + 1 ),b[i]);
     }
   return 0;
}