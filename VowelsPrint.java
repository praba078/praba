package Praba;
import java.util.Scanner;
public class VowelsPrint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp=new Scanner(System.in);
		String s=sp.nextLine();
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
           System.out.print(s.charAt(i));	
		}
		
		}
		String a=s.replaceAll("[aeiou]","");
		System.out.println();
		System.out.println(a);
	}

}
