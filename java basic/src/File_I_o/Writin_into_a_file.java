package File_I_o;

import java.io.FileWriter;
import java.io.IOException;

public class Writin_into_a_file {

	public static void main(String[] args)   throws IOException
	{
		// TODO Auto-generated method stub
			FileWriter fw=null;
			try
			{
			 fw=new FileWriter("C:/Users/SANMUGAM/Desktop/filereader.txt");
				String s="i am learning  java for past 45 days";
				fw.write(s);
				fw.flush();
				System.out.println("succesfully writen into a file,please check your file ");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			
			{
				fw.close();
			}
		}
	}


