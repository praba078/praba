package Guvi;
import java.util.Scanner;
public class Subset_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sp=new Scanner(System.in);
		 String e=sp.nextLine();
		char s;
		for(int i=1;i<e.length();i++)
		{
			s=e.charAt(i);
			System.out.println(e.substring(0,1)+s);
}
	}

}
