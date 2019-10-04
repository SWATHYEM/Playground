#include<stdio.h>
#include<string.h>

#define MAX_LEN 40

int main()
{
    char a[MAX_LEN];
    scanf("%s", a);
    int str_len = strlen(a);
    
    int ccount, rcount;
    scanf("%d", &ccount);
    rcount = (str_len / ccount);
    if((str_len % ccount) > 0)
    {
        rcount = rcount + 1;
    }
    
    int m,n;
    for(m = 0; m < ccount; m++)
    {
        for(n = 0; n < rcount; n++)
        {
            int curr_char_idx = m + (n * ccount);
            if((n % 2) == 0)
            {
                // Do nothing
            }
            else
            {
              int last = (ccount - 1) + (n * ccount);
                curr_char_idx = last - m;
            }
            
            char ch;
            if(curr_char_idx >= str_len)
            {
                ch = 'X';
            }
            else
            {
                ch = a[curr_char_idx];
            }
            
            printf("%c", ch);
        }
    }
        
    return 0;
}