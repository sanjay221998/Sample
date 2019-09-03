package My_Recorsion;

public class Print_1_to_100 {
	void disp(int n)
	{
		System.out.println(n);
		if(n>=1)
		{
			disp(n-1);
		}
		//System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_1_to_100 obj=new Print_1_to_100();
		obj.disp(100);
	}

}
