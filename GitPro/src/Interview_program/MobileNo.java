package Interview_program;

public class MobileNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=867895564;
		String s1=" ";
		int count=0;
		String s=Integer.toString(i);
		int b[]=new int[s.length()];
		for(int k=0;k<b.length;k++)
		{
			b[k]=Character.getNumericValue(s.charAt(k));;
		}
		
		for(int j=0;j<b.length;j++)
		{
			if(b[j]%2==0)
			{
				System.out.print(b[j]+" ");
				count++;
			}
		}
		System.out.println("\n"+count);
	}

}
