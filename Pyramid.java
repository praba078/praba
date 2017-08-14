package Guvi;
import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sp=new Scanner(System.in);
  int s=sp.nextInt();
  for(int h=0;h<s;h++)
  {
	  for(int t=0;t<2;t++)
	  {
		  for(int g=h;g<s;g++)
		  {
			  System.out.print("*");
		  }
	  System.out.print(" ");
  }System.out.println();
	}}

}
