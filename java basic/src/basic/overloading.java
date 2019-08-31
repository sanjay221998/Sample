package basic;

public class overloading {

	int a = 1;
	int b = 2;

	int sum(int a) {
		int x = this.a + a;
		System.out.println(x);
		return x+a;

	}

	int sum(int a, int b) {
		int x = this.b + b + this.a + a;
		System.out.println(x);
		return x;

	}

	public static void main(String[] args) {
		overloading obj = new overloading();
		obj.sum(7, 3);
		obj.sum(5);
	}
}
