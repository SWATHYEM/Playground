#include<stdio.h>
int main()
{
   int a[50];
   int n;
   scanf("%d",&n);
   for(int i=0;i<=n;i++)
   {
     scanf("%d",&a[i]);
   }
    int sum_arr[3 * n];
    subsequence(n,a,sum_arr);
}
int subsequence(int n,int a[],int sum_arr[])
{
  for(int j=0;j<=n-1;j++) 
  {
    int temp=a[j];
    for(int k=j+1;k<=n-1;k++)
     {
      if(a[k]>temp)
       printf("%d,%d\n",temp,a[k]);
    }
  }
}
