#include <stdio.h>


int main()

{
    int a=45,b=98;

    printf("Before Swapping %d %d",a,b);
   
 a=a+b;
   
 b=a-b;
   
 a=a-b;
   
 printf("\nAfter Swapping %d %d",a,b);
   
 return 0;

}
