package Guvi;
import java.util.*;
class Repeated
{
public static void main(String a[])
{
int n,i;
System.out.println("Enter total no of values in the array");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=s.nextInt();
for(i=1;i<n;i++)
{
  for(int j=0;j<i;j++)
  {
    if(a[j]==a[i])
    System.out.println(a[j]+"");
    break;
  }
  break;
}
}
}