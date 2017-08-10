package Guvi;

import java.util.Scanner;

public class Palindrome757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int abc=sc.nextInt();
		int r=0;
		int s=0;
		int ri=0;
		int rv=0;
		while(abc!=0){
			r=abc%10;
			s=s+r;
			abc=abc/10;
		}
		while(s!=0){
			ri=s%10;
			rv=rv*10+ri;
			s=s/10;
		}
		if(s==rv){
			System.out.println(" is a palindrome");
		}
		else{
			System.out.println("not palindrome");
}
	}

}
