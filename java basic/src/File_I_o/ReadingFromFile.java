package File_I_o;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFromFile {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		FileReader fr=null;
		String s="";
		try
		{
		 fr=new FileReader("C:/Users/SANMUGAM/DesKtop/filereader.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				//System.out.print((char)i);
				s=s+((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		
		{
			fr.close();
		}
		System.out.println(s);
	}

}
