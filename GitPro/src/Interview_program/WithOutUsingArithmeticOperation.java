package Interview_program;
public class WithOutUsingArithmeticOperation {
	int sum(int a, int b) {
		int c = a;int d = b;
		while (b != 0) {
			int carry = (a & b);
			a = a ^ b;			
			b = carry << 1;}
		System.out.println(c + "+" + d + "=" + a);
		return a;
	}
	int sub(int x, int y) {
		int a = x;int b = y;	
		while (y != 0) {
			int borrow = (~x) & y;
			x = x ^ y;
			y = borrow << 1;
		}
		System.out.println(a + "-" + b + "=" + x);
		return x;
	}
	int mul() {
		int n = 10;int c = 5;int product = 0;		
		for (int i = 0; i < c; i++) {
			product = product + n;
		}
		System.out.println(n + "*" + c + "=" + product);
		return 0;
	}
	int div(int a, int b) {
		int c = a;
		int d = b;
		int remainder = 0;
		while (a >= b) {
			a -= b;
			remainder++;
		}
		System.out.print(c + "/" + d + "=" + "quotient:" + remainder + "    remainder:" + a);
		return remainder;
	}
	public static void main(String[] args) {
		WithOutUsingArithmeticOperation d = new WithOutUsingArithmeticOperation();
		d.sum(4, 6);
		d.sub(10, 5);
		d.mul();
		d.div(10, 3);
	}
}
