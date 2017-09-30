package Praba;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp=new Scanner(System.in);
		int n=sp.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sp.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			if(a[i]<a[i+1]) {
		System.out.print(a[i+1]);
		break;
		}
		}
	}

}
