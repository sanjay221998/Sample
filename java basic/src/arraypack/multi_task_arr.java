package arraypack;

public class multi_task_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 5, 6, 8, 90, 56, 77, 89, 99, 100 };
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		int even = 0;
		int odd = 0;
		System.out.println("EVEN ELEMENT");
		for (int i = 0; i < a.length; i++) {
			// int count=0;
			// count++;

			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " ");
				a[i] = b[i];
				even++;
			}
			/*
			 * else { System.out.println(a[i]+" "); }
			 */
		}
		System.out.println("EVEN COUNT=" + even);

		for (int i = 0; i < b.length; i++) {
			// System.out.println("EVEN ELEMENT");
			if (b[i] != 0)
				System.out.println(b[i]);
		}
		System.out.println("ODD ELEMENT");
		for (int i = 0; i < a.length; i++) {
			// int count=0;
			// count++;

			if (a[i] % 2 != 0) {
				System.out.println(a[i] + " ");
				a[i] = c[i];
				odd++;
			}

		}
		System.out.println("ODD COUNT=" + odd);
		for (int i = 0; i < c.length; i++) {
			if (c[i] != 0)
				System.out.print(c[i] + "ODD ELEMENT");
		}

	}
}
