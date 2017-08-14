package Guvi;
import java.util.Scanner;
public class Right_greater {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sp=new Scanner(System.in);
int n=sp.nextInt();
int s[]=new int[n];
int b=0;
for(int i=0;i<n;i++)
{
	s[i]=sp.nextInt();
}
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(s[j]>b)
            b=s[j];
    }
    s[i]=b;
    b=0;
   }
      for(int i=0;i<n;i++)
{
   System.out.print(s[i]+" ");
} 	
	}

	}


