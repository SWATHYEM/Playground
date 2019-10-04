#include<stdio.h>
#include<string.h>
int main()
{
  
  char str1[100];
  int flag=0;
  gets(str1);
  int len=strlen(str1);
  for(int i=0;i<len;i++)
  {
    if(str1[i]!=str1[len-i-1])
    {
      flag=1;
      break;  
      
   }
  }
  if(flag==1)
  {
    printf("%s is not a palindrome",str1);
   }
  else
  {
    printf("%s is a palindrome",str1);
  }
  return 0;
}