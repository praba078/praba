package Guvi;

import java.util.Scanner;
public class DeletingData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int temp=0;
		int p;
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		p=in.nextInt();
		int d=(int)Math.log10(m)+1;
		int s=d-p;
		int[] ar=new int[d];
		for(int i=0;i<ar.length;i++){
			ar[i]=m%10;
			m/=10;
		}for(int j=0;j<ar.length;j++){
			for(int r=ar.length-1;r>j;r--){
				if(ar[j]>ar[p]){
					temp=ar[p];
					ar[p]=ar[j];
					ar[j]=temp;
				}
			}	
		}if(s!=0){
			System.out.print("The Smallest value after deleting "+p+" digits from number: ");
			for(int j=0;j<s;j++){
				System.out.print(ar[j]);
			}
		}else{
			System.out.print("Not valid");
		}
	}

}
