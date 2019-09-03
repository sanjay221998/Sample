package string_pack;

public class String_buff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("APPA");
		StringBuffer r=new StringBuffer(s);
		r.reverse();
		String x=s.toString();
		String y=r.toString();
		if(x.equals(y))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not pALINDROME");
		}
	}

}
