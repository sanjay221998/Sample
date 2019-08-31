package Exception_pgm;

public class Number_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		System.out.println("DECIMAL"+"\t\tBINARY"+"\t\tOCTAL"+"\t\tHEXA");
		for(int i=0;i<=n;i++)
		{
			System.out.println(i+"\t\t"+Integer.toBinaryString(i)+"\t\t"+Integer.toOctalString(i)+"\t\t"+Integer.toHexString(i)+"\t");
		}
	}

}
