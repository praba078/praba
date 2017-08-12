package Guvi;
import java.util.Scanner;
public class Fibanocci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sp=new Scanner(System.in);
		 int s1=0,s2=1,s3;
		 for(int i=2;i<10;i++)
		 {
			 s3=s1+s2;
			 System.out.println(s3);
			 s1=s2;
			 s2=s3;
		 
		 }
	}

}
