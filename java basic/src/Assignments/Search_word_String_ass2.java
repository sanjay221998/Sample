package Assignments;

import java.util.Scanner;

public class Search_word_String_ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING:");
		String s=sc.nextLine();
		System.out.println("ENTER THE SEARCH STRING:");
		String word=sc.next();
		for(int i=0;i<s.length();i++)
		{
			if(s.contains(word))
			{
				System.out.println("found");
				break;
			}
			else
			{
				System.out.println("not found");
				break;
			}
		}
	}

}
