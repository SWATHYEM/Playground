#include <stdio.h>
int main() {
    int num;
    scanf("%d", &num);
     int val = num;
for(int i = 1; i <= num; i++)
{
        
   for(int j = val; j >= 1; j--)
   {
       printf("%d",j);
   }
   val--;
   printf("\n");
}
return 0;
}