#include<stdio.h>
#include<string.h>
void main()
{
  char str1[1000],str2[1000];
  gets(str1);
  gets(str2);
  int str1_len = strlen(str1);
  upper_string(str1);
  int str2_len = strlen(str2);
  upper_string(str2);
  int count = 0;
  for (int i = 0; i < (str1_len - str2_len + 1); i++)
    {
      int is_matching = 1;
      for(int j = 0; j < str2_len; j++)
      {
        if(str1[i + j]!= str2[j])
        {
          is_matching = 0;
        }
      }
      if(is_matching == 1)
      {
        count=count+1;
      }
    }
    printf("%d", count);
}
void upper_string(char s[])
{
  int c = 0;
  while(s[c]!='\0')
  {
    if(s[c]>='a'&&s[c]<='z')
     {s[c]=s[c]-32;}
       c++;
  }
}
