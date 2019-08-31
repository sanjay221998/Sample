package Exception_pgm;

import java.io.IOException;

public class Throws {
	void add()throws IOException
	{
		int a,b,c=67;
	
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws t=new Throws();
		try
		{
			t.add();
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
