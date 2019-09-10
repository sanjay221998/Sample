package Interview_program;

import java.util.Scanner;

public class Diaognal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the word:");
		String a=scr.nextLine();
		//System.out.println("Enter num of lines");
		//int j=scr.nextInt();
		String w=a.replaceAll(" ", "");
		//System.out.println(a.trim());
		char[] b=w.toCharArray();
		for(char cc:b)
			System.out.print(cc+"\n");//verification

		for(int i=0;i<b.length;i++)
		{
			
			if((i==0)||(i%2==0))
			{
				System.out.print(b[i]+" ");
			}
		}
			System.out.println();
			for(int k=0;k<b.length;k++)
			{
			if(k%2==1)
			{
				System.out.print(" "+b[k]);
			}
		}


	}

}
