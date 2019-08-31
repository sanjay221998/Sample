package arraypack;

public class Count_vowels_ary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'p','a','y','i','l','a','g','a','m'};                                                         
		char v[]= {'a','e','i','o','u'};
		//String name=null;
		int count=0;
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<v.length;j++)
			{
				if(c[i]==v[j])
				{
					//System.out.println(c[i]);
					count++;
				}
				
			}
		}
		System.out.println(count);
		}
	}


