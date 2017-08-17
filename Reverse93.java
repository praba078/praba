package Guvi;
import java.util.Scanner;
public class Reverse93 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp=new Scanner(System.in);
		String s=sp.nextLine();
		String p[]=s.split(" ");
	String rev=" ";
		for(int i=0;i<p.length;i++)
		{	StringBuffer sd=new StringBuffer(p[i]);
			rev=sd.reverse().toString();
		  System.out.print(rev+" ");
		
		}

		
	}

}
