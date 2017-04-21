#include<stdio.h>
#include<conio.h>
int main()
{
int num;
printf("enter the num:");
scanf("%d",&num);
if(num>0)
{
printf("it is positive:%d",num);
}
else if(num<0)
{
printf("it is negative:%d",num);
}
else
{
printf("it is zero:%d",num);
}
return 0;
}
