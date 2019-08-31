package arraypack;

public class array_middle_no_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,8,9,67,89,2,4};
		//System.out.println(a[0]);
		//System.out.println(a[a.length-1]);
	//	System.out.println(a[a.length/2]);
		if(a.length%2==0)
		{
			System.out.println(a[(a.length)/2-1]);
			System.out.println(a[a.length/2]);
		}
		else
		{
			
			System.out.println(a[a.length/2]);
		}
	}

}
