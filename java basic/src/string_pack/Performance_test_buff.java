package string_pack;

public class Performance_test_buff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer s=new StringBuffer("java");
		StringBuilder s=new StringBuilder("java");
		long start=System.currentTimeMillis();
		for(int i=1;i<=1000000;i++)
		{
			s.append("program");
			
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start+"ms");
	}

}
