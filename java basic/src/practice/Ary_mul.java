package practice;

public class Ary_mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,7,3,9,2};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]*3;
			b[i]=a[i];
			
		}
		for(int aa:b)
			System.out.println(aa);
	}

}
