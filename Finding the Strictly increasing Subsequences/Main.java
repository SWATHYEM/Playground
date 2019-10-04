#include<stdio.h>
int main()
{
	int n,a[40];
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    }
   int sum[3 * n];
   subsequence(n,a,sum);
     
	return 0;
}


int subsequence(int n,int a[],int sum[])
{
	for(int j=0;j<=n-1;j++)
    {
        int temp=a[j];
        int flag=1;
        for(int k=j+1;k<=n-1;k++)
        {
            if(a[k]>temp)
            {
                for(int l=j;l<=k;l++)
                {
                    if(a[l]>a[k])
                    flag=0;
                }
                if(flag==1)
                printf("%d,%d\n",temp,a[k]);
            }
            flag=1;
        }
    }
    return 0;
}

