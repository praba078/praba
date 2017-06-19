package Guvi;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 long fact=1;
 int n;
 Scanner sp=new Scanner(System.in);
 System.out.println("enter");
 n=sp.nextInt();
 for(int i=1;i<=n;i++)
 {
	 fact=fact*i;
 }
 System.out.println(+fact);
	}

}
