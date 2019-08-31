package program;

class staticmethod {
	int a = 1, b = 2, c = 3;

	int add(int x, int y) {
		int c = x + y;
		System.out.println(c);
		return c;
	}

	static int add(int x, int y, int z) {
		int a = x + y + z;
		System.out.println(a);
		return a;
	}
}

public class loading extends staticmethod {
	void m()
	{
		staticmethod obj = new staticmethod();
		obj.add(super.a, super.b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loading obj = new loading();
		obj.m();
		//staticmethod.add(10,10,10);
	}

	

}
