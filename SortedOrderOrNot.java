package Praba;
import java.util.Arrays;
import java.util.Scanner;
public class SortedOrderOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp=new Scanner(System.in);
		int n=sp.nextInt();
		int c=0;
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sp.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(b);
		for(int i=0;i<n;i++) {
		if(a[i]==b[i]) {
			c++;
		}}
		if(c==n) {
			System.out.println("sorted order");
		}
		else {
			System.out.println("Not in sorted order");
		}
	
	}
}
