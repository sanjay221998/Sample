package InerviewProgram;

public class fibonacci {

	public static void main(String[] args) {
		
		int a=-1,b=1,c=0,n=10,i;
		
		System.out.println("fibonacci series=");
		for(i=1;i<=n;i++)
		{
		c=a+b;
		a=b;
		b=c;
			System.out.print(c+" ");
		

	}

}
}
