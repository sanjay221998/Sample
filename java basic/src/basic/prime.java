package basic;

public class prime {

	public static void main(String[] args) {
		int num=17;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
			
			}
			
		}
		if(flag)
		{
			System.out.println("not prime number");
			
		}
		else
		{
			System.out.println("prime number");
		}

	}

}
