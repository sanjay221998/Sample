package Exception_pgm;

import java.util.Scanner;

public class Throw_use {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE AGE");
		int age=sc.nextInt();
		if(age<60)
		{
			System.out.println("thakyou");
		}
		if(age<60)
		{
			throw new ArithmeticException("Not a senior citizen");
		}
System.out.println("welocme");
sc.close();
		}
		
	}


