package Assignments;

import java.util.Scanner;

public class TocountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count;
		System.out.println("ENTER THE STRING:");
		String s=sc.nextLine();
		char c[]=new char[s.length()];
		char v[]= {'a','e','i','o','u'};
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0;i<v.length;i++)
		{count=0;
			for(int j=0;j<c.length;j++)
			{
				if(v[i]==c[j])
				{
					count++;
				}
			}
			System.out.print(v[i]+" count is:"+count);
			System.out.println();
		}
		sc.close();
		
	}

}
