
#include<stdio.h>
int main()
{
  int n;
  int a[10];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  batch(a,n);
}
 
void batch(int a[],int n)
{
  int b1sum=0;
  int b2sum=0;
  for(int i=0;i<n/2;i++)
   {
    b1sum=b1sum+a[i];
    }
  for(int i=n/2;i<n;i++)
    {
      b2sum=b2sum+a[i];
    }
  if(b1sum==b2sum)
  {
    printf("Perfect Batch\n");
  }
  else
  {
    printf("Not a Perfect Batch\n");
    
  }
} 
    
    