package Pattern;
import java.util.*;
public class NumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		int a[]= {3,4,6,7,9,2};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
				count++;
			}
		}
		System.out.println("\n"+count);
		System.out.println("\n\n");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int l=sc.nextInt();
		for(int i=s;i<l;i++)
		{
			int prime=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					prime++;
				}
			}
			if(prime==2)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\n\n");
		int c[][]= {{8,1,6},{3,5,7},{4,9,2}};
		int sumrow=0,sumcol=0,sumdia=0,k=0;
		for(int i=0;i<c.length;i++)
		{
			sumrow=sumrow+c[k][i];
			sumcol+=c[i][k];
			for(int j=0;j<c.length;j++)
		{
			if(i==j)
			{
				sumdia+=c[i][j];
			}
				}
		}
		System.out.println(sumrow);
		System.out.println(sumcol);
		System.out.println(sumdia);
		if(sumrow==sumcol &&  sumrow==sumdia)
			System.out.println("magic square");
		else
			System.out.println("not a magic square");
		System.out.println("\n\n");
		int count1=0;
		int count2=0;
		for(int i=s;i<2*s;i++)
		{
			count1=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count1++;
				}
			}
			if(count1==0)
			{
				count2++;
			}
		}
		System.out.println(count2);
	}

}
