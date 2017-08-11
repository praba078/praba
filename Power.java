package Guvi;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sp=new Scanner(System.in);
		 int po=sp.nextInt();
			while((po !=2 && po % 2 == 0) || po ==1){
	          po= po /2;
	        }
			 if(po%2==0){
	       	  System.out.println("It is the power of two");
	         }else{
	       	  System.out.println("Its is not the power of two");
	}
	}

}
