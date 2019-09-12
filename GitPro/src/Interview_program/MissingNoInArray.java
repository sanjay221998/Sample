package Interview_program;

import java.util.Arrays;

public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,3,5,2,6,4,1};
		int Total_no=8;
		int sum=0;
		int expeted=(Total_no*(Total_no+1))/2;
		/*for(int i:a)
		{
			sum=sum+i;
		}*/
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		//	int num=Arrays.stream(a).sum();//using predefine method
		//System.out.println(Arrays.stream(a).sum());
		int missNo=expeted-sum;
		System.out.println("MissingNo="+missNo);
		
	}

}
