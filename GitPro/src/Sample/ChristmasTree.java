package Pattern;

public class ChristmasTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int a=1;a<=3;a++){
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
		for(int i=1;i<=4;i++) {
			System.out.print("    ");
			for(int j=3;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
