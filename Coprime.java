package Guvi;
import java.util.Scanner;
public class Coprime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp=new Scanner(System.in);
		int s=sp.nextInt();
		int p=sp.nextInt();
		for(int i=2;i<=s;i++)
		{
			for(int j=2;j<=p;j++)
			{
				if((s%i!=0) && (p%j!=0))
				{
					System.out.println("coprime");break;
				
				}
				else
				{
					System.out.println("not a coprime");break;
				}
			}
			break;}
		}
	}


