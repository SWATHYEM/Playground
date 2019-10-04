#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int a[10];
        for(int i=0;i<=n-1;i++)
        {
            scanf("%d",&a[i]);
        }
        int k;
        scanf("%d",&k);
       
        selection(n,a);
        printf("%d",a[n-k]);
      return 0;
}
 void selection(int n,int a[])
    {
        for(int s=0;s<=n-2;s++)
        {
            int min=minimum(s,a,n-1);
            swap(s,min,a);
        }
    }
      void swap(int s,int min,int a[])
      {
         int temp=a[s];
         a[s]=a[min];
         a[min]=temp;
     }
     int minimum(int s,int a[],int end)
     {
         int min=0;
         if(a[s]<a[s+1])
         {
             min=s;
         }
         else
         {
             min=s+1;
         }
         for(int i=s+2;i<=end;i++)
         {
             if(a[min]>a[i])
             {
                 min=i;
             }
         }
         return min;
     }