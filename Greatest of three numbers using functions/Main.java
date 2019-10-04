#include <stdio.h>
int main(){
	int a,b,c;
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);
    int gta=grt(a,b);
    int gtb=grt(gta,c);
    printf("%d",gtb);
  return 0;
}
    

int grt(int a,int b,int c)
{
   int max=0;
  if(a<=b)
  {
    max=b;
  }  
    else
    {
      max=a;
    }
  return max;
} 
