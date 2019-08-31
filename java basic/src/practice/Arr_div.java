package practice;

public class Arr_div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]= {2,4,9,1,3,7,9};
		double b[]=new double[a.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]/2;
			b[i]=a[i];
		}
		for(double bb:b)
		{
			System.out.println(bb);
		}
	}
	

}
