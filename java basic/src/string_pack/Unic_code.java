package string_pack;

public class Unic_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sanjay";
		/*byte b[]=s.getBytes();//using predefine method
		for(byte ss:b)
		{
			System.out.print(ss+" ");
		}*/
		for(int i=1;i<s.length();i++)
		{
			System.out.println((int)s.charAt(i));
		}
	}

}
