package basic;

import java.util.Scanner;

public class input_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();;
		int c=a+b;
		System.out.println(c);
		sc.close();
		
		
	}

}
