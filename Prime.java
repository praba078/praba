package Guvi;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,flag=0;
		for(i=10;i<=99;i++){
			flag=0;
			for(j=2;j<=i/2;j++){
				if(i%j==0){
					flag=1;
					break;
				} }
			if(flag==0){
				System.out.println(i+" ");
				}
			}
	}

}
