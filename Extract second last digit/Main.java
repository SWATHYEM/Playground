#include<stdio.h>
int main()
{
  int num,sl;
  scanf("%d",&num);
  int remove_ld=num/10;
  sl=remove_ld%10;
  printf("%d",sl);
  return 0;
}