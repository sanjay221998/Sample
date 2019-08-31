package practice;
public class statick {
	static final int a;
	final int n;
	{
		n=8;
	}
	static
	{
		a=7;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(n);Cannot make a static reference to the non-static field n
		System.out.println(a);
	}

}
