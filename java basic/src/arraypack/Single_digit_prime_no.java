package arraypack;

public class Single_digit_prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, count, counter = 0;
		for( num=2;num<10;num++)
		{
		count=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			count=count+1;
		}
		}
		if(count==2)
		{
			//System.out.println("prime number");
			counter++;
		}
		}
		int a[]=new int[counter];
		int k=0;
		for(num=2;num<10;num++)
		{
			count=0;
			for(i=1;i<=num;i++) {
				if(num%i==0)
				{
					count++;
				}
			}
		if(count==2)
		{
			a[k]=num;
		    k=k+1;
		}
	}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]+" ");
		}
	}
}

