#include<stdio.h>
void main()
{
int n1,n2,n3;
printf("enter n1:");
scanf("%d",&n1);
printf("enter n2:");
scanf("%d",&n2);
printf("enter n3:");
scanf("%d",&n3);
if(n1>n2 && n1>n3)
printf("\n%d is the largest",n1);
else if(n2>n3)
printf("\n%d is the largest",n2);
else
printf("\n%d is the largest",n3);
}
