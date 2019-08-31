package InerviewProgram;

public class Find_secodLargest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {67,89,56,78,45};
		int f=a[a.length-a.length];
		int s=a[0];
		//int t=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>f)
			{
				f=a[i];
			}
			else if(a[i]>s)
			{
				s=a[i];
			}
			
			
		}
		System.out.println("first number="+f);
		System.out.println("second number="+s);
		//System.out.println("third number="+t);
	}

}
