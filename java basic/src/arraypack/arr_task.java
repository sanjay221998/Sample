package arraypack;

public class arr_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 67, 89, 76, 56, 98 };
		for (int i = 0; i < a.length; i++)// print array in single line
		{
			System.out.print(a[i] + " ");
		}
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > max)// print maximum value
				{
					max = a[i];
				}
			}
		}
		System.out.println("\n\nMAXIMUM VALUE=" + max);
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < min)// print minimum value
				{
					min = a[i];
				}
			}
		}
		System.out.println("\nMINIMUM VALUE=" + min);
		int sum = 0;
		for (int k = 0; k < a.length; k++) {
			sum = sum + a[k];
		}
		System.out.println("\nSUM OF A[] ARRAY=" + sum);
		int avg = 0;
		for (int p = 0; p < a.length; p++) {
			avg = sum / a.length;// average print
		}
		System.out.println("\nAVERAGE=" + avg);
		/*
		 * for(int l=a.length-1;l>=0;l--)//reverse order { System.out.println(a[l]); }
		 */
		int temp;
		for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		// System.out.println(temp);
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] + " ");
		}
		int b[] = new int[a.length];
		for (int m = 0; m < a.length; m++)// backup
		{
			b[m] = a[m];
		}
		for (int bb : b) {
			System.out.print("\n" + bb + " ");
		}
	}

}
