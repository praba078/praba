package Guvi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int r=0;
		int s=0;
		int ri=0;
		int rev=0;
		while(a!=0){
			r=a%10;
			s=s+r;
			a=a/10;
		}
		while(s!=0){
			ri=s%10;
			rev=rev*10+ri;
			s=s/10;
		}
		if(s==rev){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
}
	}

}
