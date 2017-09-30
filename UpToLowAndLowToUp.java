package Praba;

import java.util.Scanner;

public class UpToLowAndLowToUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp=new Scanner(System.in);
		String s=sp.nextLine();
		int i,l;
		char ch;
		l=s.length();
		for(i=0;i<l;i++)
		{
		ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		System.out.print(Character.toLowerCase(ch));
		else if(Character.isLowerCase(ch))
		System.out.print(Character.toUpperCase(ch));
		
	}
	}
}
