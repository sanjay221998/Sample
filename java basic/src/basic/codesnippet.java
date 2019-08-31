package basic;

class code {
	int a=5;
	int m() {
		int a = 6;
		System.out.println(a);
		this.a = 11;
		return a;
	}

	int n() {
		System.out.println(a);
		return a;
	}
}

public class codesnippet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			code cd = new code();
			cd.m();
			cd.n();
		}
	}

}
