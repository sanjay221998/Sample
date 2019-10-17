package Pattern;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strating value:");
		int start=sc.nextInt();
		System.out.println("enter the ending value:");
		int end=sc.nextInt();
		//while(n>0) {
		for(int j=start;j<=end;j++)
		{
			int temp=0;
			for(int i=2;i<=j-1;i++)
			{
				if(j%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(j);
			}
		}
		//}
	}

}
