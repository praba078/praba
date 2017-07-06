package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner u=new Scanner(System.in);
		System.out.println("enter");
		String ori=u.next();
		String rev=new StringBuffer(ori).reverse().toString();
		System.out.println(rev);
		if(ori.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome+");
		}
	}

}
