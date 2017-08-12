package Guvi;
import java.util.Scanner;
public class Sum_Digit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sp=new Scanner(System.in);
		 int s=sp.nextInt();
		 int rem,rem1,rem2,rem3,rem5,rem4,sum,rem6;
		 rem=s%10;
		 rem1=s/10;
		 rem2=rem1%10;
		 rem3=rem1/10;
		 rem4=rem3%10;
		 rem5=rem3/10;
		 rem6=rem5%10;
		 sum=((rem+rem2+rem4+rem6)+(rem6+rem2+rem4)+(rem6+rem4)+(rem6));
		 System.out.println(sum);
	}

}
