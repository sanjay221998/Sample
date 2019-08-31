package InerviewProgram;

import java.util.Scanner;

public class Amstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit=0,amstrong=0,result=1,no;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		int no1=no;
		int no2=no;
		
		while(no>0)
		{
			no1=no/10;
			digit++;
		}
		while(no>0)
		{
			int rem=no%10;
			for(int i=0;i<digit;i++)
			{
				result=result+rem;
				System.out.println(result);
			}
			amstrong=amstrong+result;
			no=no/10;
			result=1;
		}
		if(no2==amstrong)
		{
		System.out.println("this is amstrong number");	
		}
		else
		{
			System.out.println("this is not amstrong number");
		}
	}

}
