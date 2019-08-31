package arraypack;

import java.util.Scanner;

public class Arr_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ad=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF AN ARRAY:");
		int n=ad.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("ENTER ELEMENT AT" +i+ "INDEX");
			a[i]=ad.nextInt();
			
		}
		for(int aa:a)
		{
			System.out.print(aa+" ");
		}
				ad.close();
		
	}

}
