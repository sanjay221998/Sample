package practice;

public class Factores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		for(int i=1;i<=num;i++)
		{
			System.out.print(i+"factor---->");
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}
