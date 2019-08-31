package My_Recorsion;

public class Factorial {
	int fact(int n)
	{
		//System.out.println(n);
		{
			if(n==0)
			return 1;
			else
				return(n*fact(n-1));
		}
		//System.out.println(n);
		//System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f=new Factorial();
		;
		System.out.println(f.fact(5));
	}

}
