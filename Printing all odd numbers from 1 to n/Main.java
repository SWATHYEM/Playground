#include <stdio.h>
int main() 
 {
	int num;
    scanf("%d",&num);
    for(int i=1;i<=num;i+=2)
    {
      printf("%d",i);
      printf("\n");
    }
	return 0;

}