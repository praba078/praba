package Guvi;
import java.util.Scanner;
public class Adding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of pairs:");
		Scanner sp= new Scanner(System.in);
		int n=sp.nextInt();
		int s=(2*n)-1;
		System.out.println("The pairs of 3 days: ");
		for(int i=1;i<=(2*n-1);i++){
		for(int j=i+1;j<=s;j++){
			System.out.println(+i+" "+j);}
}
	}

}
