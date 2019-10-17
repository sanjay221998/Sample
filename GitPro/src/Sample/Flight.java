package Pattern;

public class Flight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<2*i;k++)
			{
				System.out.print("*");
			}
			/*for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}*/
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=3;j<=30;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
