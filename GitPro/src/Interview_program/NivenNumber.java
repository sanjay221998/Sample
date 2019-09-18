package Interview_program;

public class NivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int copy=num,n=0,sum=0;
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
			num=num/10;
		}
		System.out.println(sum);
		if(copy%sum==0)
			System.out.println("niven number");
		else
			System.out.println("not niven number");
		
	}

}
