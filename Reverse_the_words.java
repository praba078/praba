package Guvi;
import java.util.Scanner;
public class Reverse_the_words {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp=new Scanner(System.in);
		String s=sp.nextLine();
		String r[]=s.split(" ");
		for(int i=r.length-1;i>=0;i--)
		{
		  System.out.print(r[i]+" ");  
		}

	}

}
