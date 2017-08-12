package Guvi;
import java.util.Scanner;
public class Camel_Case {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sp=new Scanner(System.in);
		 String q=sp.nextLine();
		 int count=0;
		 for(int i=0;i<q.length();i++)
		 {
			 if((q.charAt(i)>='A'&& q.charAt(i)<='Z'))
			 {
				 count++;
			 }
		 }
		 if(count>0)
		 {
			 System.out.println("It is an camel case");
		 }
		 else
		 {
			 System.out.println("not an camel case");
		 }
	}

}
