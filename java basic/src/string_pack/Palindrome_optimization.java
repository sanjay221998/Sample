package string_pack;

public class Palindrome_optimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="appa";
		boolean flag=true;
		char c[]=new char[s.length()];
		//char cc[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
			//cc[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			if(c[i]!=c[c.length-i-1])
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
