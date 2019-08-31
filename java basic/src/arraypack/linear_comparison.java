package arraypack;


public class linear_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'y','a','e','i','z','o','u'};
		char temp=0;
		for(int i=0;i<a.length;i++)
			
		{
			/*for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
				a[j]=0;
			}
			}*/
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i] > a[j])//swap logic ">"---->ascending order"<"----> descending order
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
						
			}
			}
	
	}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
			
		
		
