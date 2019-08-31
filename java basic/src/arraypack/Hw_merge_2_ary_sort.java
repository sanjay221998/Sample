package arraypack;

public class Hw_merge_2_ary_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 5, 7, 2, 9, 67, 98 };
		int b[] = { 78, 90, 39, 89, 34, 78, 8 };
		int z[] = new int[a.length + b.length];
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			z[i] = a[i];

		}
		int k = 0;
		for (int i = b.length; i < z.length; i++) {
			z[i] = b[k];
			k++;

		} //

		for (int i = 0; i < z.length; i++) {
			for (int j = i + 1; j < z.length; j++) {
				if (z[i] > z[j]) {
					temp = z[i];
					z[i] = z[j];
					z[j] = temp;
				}
			}
		}
		for (int zz : z) {
			System.out.print(zz + " ");
		}
	}

}
