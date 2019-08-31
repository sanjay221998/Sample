package InerviewProgram;

public class Spy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i=123;
			int sum=0;
			int mul=1;;
			for(int j=0;j<=3;j++)
			{
				sum=sum+i%10;
				mul=mul*i%10;
				i=i/10;
				
				
			}
			if(sum==mul)
			System.out.println("this is spy number");
			else
				System.out.println("this is not spy number");
	}

}
