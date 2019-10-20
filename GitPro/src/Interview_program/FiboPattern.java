package ArrayPgm;
import java.util.Scanner;

public class FiboPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int count=0;
			int f=-1,s=1,total=0;
			for(int i=1;i<=n;i++)
				count=count+i;
			int arr[]=new int[count];
			for(int j=0;j<count;j++)
			{
				total=f+s;
				arr[j]=arr[j]+total;
				f=s;
				s=total;
			}
			int p=0;
			for(int k=1;k<=n;k++)
			{
				for(int i=1;i<=k;i++)
				{
				System.out.print(arr[p]+" ");	
				p++;
				}
				System.out.println();
			}
			
	}

}
