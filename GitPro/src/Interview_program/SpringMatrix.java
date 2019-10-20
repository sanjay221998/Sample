package Interview_program;

public class SpringMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int arr[][] = new int[4][4];
			int value = 1;
			int minrow = 0;
			int maxrow = 3;
			int mincol = 0;
			int maxcol = 3;
			while (value <16) 
			{
				for (int i = mincol; i <= maxrow; i++) {
					arr[mincol][i] = value;
					value++;
				}
				for (int i = minrow + 1; i <= maxrow; i++) {
					arr[i][maxcol] = value;
					value++;
				}
				for (int i = maxcol - 1; i >= mincol; i--) {
					arr[maxrow][i]=value;
					value++;
				}
				for (int i = maxcol - 1; i >minrow; i--) {
					arr[i][mincol] = value;
					value++;
				}
				mincol++;
				maxcol--;
				minrow++;
				maxrow--;
			}
				for (int i= 0; i < arr.length; i++) {
					for (int j = 0; j< arr.length; j++) {
						System.out.print( arr[i][j]+",");
					}
					System.out.println();
				}		

	}

	}}
