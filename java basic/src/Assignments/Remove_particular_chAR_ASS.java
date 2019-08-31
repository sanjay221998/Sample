package Assignments;

import java.util.Scanner;

public class Remove_particular_chAR_ASS {
	String removeChar(String s,char c)
	{
		String r=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=c) {
				r+=s.charAt(i);
				//break;
			}		
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=ac.nextLine();
		System.out.println("ENTER THE REMOVE CHARACTER:");
		char c=ac.nextLine().charAt(0);
		Remove_particular_chAR_ASS r=new Remove_particular_chAR_ASS();
		System.out.println(r.removeChar(s,c));
		ac.close();
}
}
