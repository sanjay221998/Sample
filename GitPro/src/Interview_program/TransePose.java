package Interview_program;

public class TransePose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{2,7,4},{4,5,3},{7,4,5},{9,0,8}};
		int b[][]=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]);
			}
		
			System.out.println();	
		}
	}

}
