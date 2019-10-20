package ArrayPgm;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"sanjay","anish","seethe"};
		int s[]=new int[str.length];
		System.out.println(str.length);
		for(int i=0;i<str.length;i++)
		{
			s[i]=str[i].length();
		}
		for(int ss:s)
			System.out.print(ss+" ");
		int a[][]= {{1,3,2},{4,3,5},{
			4,3,5}};
		int b[][]=new int[a.length][a.length];
		int sum=0;
	int SumDia1=0,k=a.length-1,SumDia=0;
		//sum of 2d array
		for(int i=0;i<a.length;i++)
		{
			if(k>=0)
				SumDia1+=a[i][k];
			k--;
			for(int j=0;j<a.length;j++)
			{
				sum+=a[i][j];
				if(i==j)
				{
					SumDia+=a[i][j];
				}
			}}
		System.out.println("\n"+sum);
		//sum of row
		int rowSum=0,colSum=0;
	for(int i=0;i<a.length;i++)
	{
		if(i==1)
			break;
		for(int j=0;j<a.length;j++)
		{
			rowSum+=a[i][j];
			colSum+=a[j][i];
			
			
		}
	
	}
	System.out.println(rowSum);
	System.out.println(colSum);
	System.out.println(SumDia);
	System.out.println(SumDia1);
	}

}
