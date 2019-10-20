package Attend_interview_program;

public class RepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sanjays";
		char a[]=s.toCharArray();
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			count=0;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j&&a[i]==a[j])
				{
					count=1;
					//System.out.println("\n"+a[j]);
					//count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]);
				break;
			}
		}
		//System.out.println(count);
	}

}
