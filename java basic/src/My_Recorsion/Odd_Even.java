package My_Recorsion;

public class Odd_Even {
	int number(int n)
	{
		System.out.println(n);
		{
			if(n<100)
			{
				number(n+2);
			}
			return n;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=2;
		int odd=1;
		Odd_Even obj=new Odd_Even();
		System.out.println("EVEN ELEMENT");
		obj.number(even);
		System.out.println("ODD ELEMENT");
		obj.number(odd);
		

	}

}
