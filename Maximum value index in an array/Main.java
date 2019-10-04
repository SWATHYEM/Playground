int main() {
   int n,a[10],i;
   scanf("%d",&n);
   for( i = 0; i < n ; i++)
   {
       scanf("%d",&a[i]);
   }
  
   larges(a,n);
  
   return 0;  
}

 void larges(int a[],int n)
 {
     int i,large ,c;
     large = a[0];
     c = 0 ;
     for( i = 1; i < n ; i++)
   { 
       if(large<a[i])
       {
           c = i;
           
       }
      
   }  
   printf("%d",c);
 }