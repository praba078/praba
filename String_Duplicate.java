package Guvi;
import java.util.Scanner;
public class String_Duplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sp=new Scanner(System.in);
		 String sr=sp.nextLine();
		 char s[]=sr.toCharArray();
		 for(int i=0;i<s.length;i++)
		 {
			 for(int j=i+1;j<s.length;j++)
			 {
				 if(s[i]==s[j])
				 {
					 s[j]=0;
				 }
			 }
		 }
		 for(int i=0;i<s.length;i++)
		 {
			 if(s[i]!=0)
			 {
				 System.out.print(s[i]);
			 }
		 }
	}

}
