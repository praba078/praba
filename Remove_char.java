package Guvi;
import java.util.Scanner;
public class Remove_char {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sp=new Scanner(System.in);
		 String s=sp.nextLine();
		 int p=0,i=0;
		 for( i=0;i<s.length();i++)
		 { p=0;
			 for(int j=0;j<s.length();j++)
			 {
				 if(s.charAt(i)==s.charAt(j))
				 {
					 p=p+1;
				 }
			 }
		 
		 if(p==1)
		 {
			 System.out.print(s.charAt(i));
		 }
	}}

}
