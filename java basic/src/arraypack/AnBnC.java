package arraypack;

public class AnBnC {
	public static void main(String[] args) {
		int a[]= {2,7,67,89,56};
		int b[]= {7,89,67,4,2,78};
		int c[]= {67,89,90,65,34,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<c.length;k++) {
					
					if(a[i]==b[j]&&b[j]==c[k])
					{
						System.out.println(a[i]);
					}
				}
				
			}
		}

		
	}

}
