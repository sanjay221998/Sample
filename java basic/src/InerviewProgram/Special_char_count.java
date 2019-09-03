package InerviewProgram;

import java.util.Scanner;

public class Special_char_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.next();
		//String s="dsfjsjvbs78759087875r@#RR#";
		char b[]=s.toCharArray();
		int count=0;
		int coun=0;
		
		System.out.println(b.length);
		/*for(int i=0;i<b.length;i++)
		{
			b[i]=s.charAt(i);
		}*/
		for(char bb:b)
		System.out.print(bb+" ");
		
		for(int i=0;i<b.length;i++)
		{
			if(!(((b[i]>=65)&&(b[i]<=90))||((b[i]>=97)&&(b[i]<=122))))
			{
				count++;
			}
			else
			{
				coun++;
			}
		}
		System.out.println("\n"+count);
		System.out.println("\n"+coun);
		
		
		
		
	}

}
