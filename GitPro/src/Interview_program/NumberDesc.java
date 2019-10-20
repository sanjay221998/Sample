package Interview_Question;

import java.util.Arrays;

public class NumberDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1463,n=a,n1=a,result=0;
		int count=0;
		while(n1>0)
		{
			 n1=n1/10;
			 System.out.println(n1);
			count++;
		}
		int b[]=new int[count];
		System.out.println(count);
		for(int i=0;i<b.length;i++)
			{int num=n%10;
				b[i]=num;
				n=n/10;
			}
			System.out.println(Arrays.toString(b));
			Arrays.sort(b);
			
		/*for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}*/
			
		for(int v:b)
		{
			System.out.print(v);
		}
	}}
