package Guvi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sp=new Scanner(System.in);
int value7=sp.nextInt();
long fact=1;
for(int i=1;i<=value7;i++)
{
	fact=fact*i;
}
System.out.println(fact);
	}

}
