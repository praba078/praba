package Guvi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sp=new Scanner(System.in);
int num=sp.nextInt();
long fact=1;
for(int i=1;i<=num;i++)
{
	fact=fact*i;
}
System.out.println(fact);
	}

}
