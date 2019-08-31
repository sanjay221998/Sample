package patterns;

public class diagonal_line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
for(int i=1;i<=a;i++)
{
	for(int j=1;j<=a;j++)
	{
		if(i==j)
		{
			System.out.print(i);
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println("");
}
	}

}
