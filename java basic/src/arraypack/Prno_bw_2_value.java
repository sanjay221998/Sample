package arraypack;

public class Prno_bw_2_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=145;
		//int i;
		
		for(int i=145;i<194;i++)
		{
			int count=0;
			//count++;
			for(int j=1;j<=i;j++)
			{
			if(i%j==0)
			{
				count++;
			}
			}
			if(count==2)
			{
				System.out.println(i);
		}
	}

}
}
