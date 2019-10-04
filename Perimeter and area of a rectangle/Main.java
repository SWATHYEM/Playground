#include<stdio.h>
int main()
{
  int l=6;
  int b=9;
  int peri,ar;
  peri= 2*(l+b);
  ar=l*b;
  printf("The perimeter of the rectangle is: %d cm\n",peri);
  printf("The area of the rectangle is: %d sq cm\n",ar);
  return 0;
}