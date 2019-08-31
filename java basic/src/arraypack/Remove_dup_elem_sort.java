package arraypack;

public class Remove_dup_elem_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 9, 2, 3, 9, 7, 89, 67, 3, 10, 15 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[i] = 0;

				}
			}
		}
		// sorting
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)

				System.out.println(a[i]);
		}
	}

}
