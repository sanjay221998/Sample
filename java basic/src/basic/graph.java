package basic;

public class graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
for(int i=1;i<=10000000;i++)
{
	System.out.println(i);
}
		long endTime=System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000 +"s");
	}

}
