package Guvi;
import java.util.Scanner;
public class Remove_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sp=new Scanner(System.in);
		 String s=sp.nextLine();
		 String rev= new StringBuffer(s).reverse().toString();
		 System.out.println(rev);
		 String v=rev.replaceAll("[aeiouAEIOU]","");
		 System.out.println(v);
	}

}
