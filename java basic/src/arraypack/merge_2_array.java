package arraypack;

public class merge_2_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,45,78,90,7};
		int y[]= {2,8,6,9};
		int z[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
			
		}
		int j=0;
		for(int i=x.length;i<z.length;i++)
		{
			z[i]=y[j];
			j++;
			//System.out.println(z[i]);
		}
		//System.out.println(z[6]);
		for(int zz:z)
		{
			System.out.println(zz);
		}
	}

}
