#include <stdio.h>
int main() 
{
  int ab,ac,a,b,c;
   scanf("%d %d %d",&a,&b,&c);
    ab=gcd(a,b);
   // printf("%d",ab);
    ac=gcd(ab,c);
    printf("%d",ac);
  
}
int gcd(int a,int b)
{ //printf("%d \n%d\n",a,b);
   int min=0;
    int gcd1;
   if(a<b)
     {
      min=a;
    }
   else
    {
     min=b;
    }
  while(min>=1)
  {
    if((a%min==0)&&(b%min==0))
    {
        gcd1=min;
       break;
     }
     min--;
  }
   return gcd1;

}
