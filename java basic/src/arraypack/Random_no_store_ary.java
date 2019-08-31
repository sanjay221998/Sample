package arraypack;

public class Random_no_store_ary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[6];
		int num = 0;
		for (int i = 0; i <a.length; i++) {
			num = (int) (Math.random() * 1000000);
			a[i] = num;
			// System.out.print(num+" ");
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
	}

}
