package Assignments;

import java.util.Scanner;

public class LastIndex_ass2_method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=ac.nextLine();
		System.out.println("enter the search character");
		char c=ac.nextLine().charAt(0);
		String rev=" "; 
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse word is "+rev);
		for(int i=0;i<s.length();i++)
		{
			if(rev.charAt(i)==c)
			{
				System.out.println("the first occurance character ( "+c+")is"+i  );
				break;
			}
		}
	//	System.out.println(rev);
		
	}

}
