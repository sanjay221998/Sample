package arraypack;

public class Ary_AUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,45,78,90,7};
		int y[]= {2,8,7,9,90};
		//int c[]= {34,67,98,90};//third logi
		int z[]=new int[x.length+y.length];
		//int a[]=new int[z.length+c.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
			
		}
		int k=0;
		for(int i=x.length;i<z.length;i++)
		{
			z[i]=y[k];
			k++;
			//System.out.println(z[i]);
		}
		/*for(int l=0;l<z.length;l++)
		{
			a[l]=z[l];
			//System.out.print(a[l]+" ");
		}
		int p=0;
	
		for(int l=z.length;l<a.length;l++)
		{
			a[l]=c[p];
			p++;
			//System.out.print(a[l]+" ");
		}
		*/
		//int temp=0;
		for(int i=0;i<z.length;i++)
		{
			for(int j=i+1;j<z.length;j++)
			{
				if(z[i]==z[j])
				{
					z[i]=0;

				}
			}
		}
		for(int i=0;i<z.length;i++)
		{
			if(z[i]!=0)
			System.out.print(z[i]+" ");
		}
	}

}
