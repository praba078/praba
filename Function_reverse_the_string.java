package Guvi;
import java.util.Scanner;
public class Function_reverse_the_string {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner spr=new Scanner(System.in);
		String cs=spr.nextLine();
		String bs[]=cs.split(" ");
		for(int i=bs.length-1;i>=0;i--)
		{
		  System.out.print(bs[i]+" ");  
		}

	}

}
