package Guvi;
import java.util.*;
public class Arrayelements {
 	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] Arr=new int[n];
	System.out.println("ENTER THE ELEMENTS:");
	for(int i=0;i<n;i++)
	{
	Arr[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	for(int h=0;h<n;h++)
	{
	if((Arr[i]+Arr[j])==Arr[h])
	System.out.println("ELEMENT i,j,k IS:="+Arr[i]+Arr[j]+Arr[h]);
	}
	}
	}
	}
	
	}
}
