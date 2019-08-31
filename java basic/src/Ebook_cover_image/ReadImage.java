package Ebook_cover_image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//import com.sun.java.util.jar.pack.Package.File;

public class ReadImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int width=1000;
	int hight=800;
	BufferedImage image=null;
	try {
		File inputfile=new File("F:/image/lee.jpg");
		image =new BufferedImage(width, hight, BufferedImage.TYPE_INT_ARGB);
		image=ImageIO.read(inputfile);
		System.out.println("image hight"+image.getData().getBounds().getWidth());
		
	}
	catch(IOException e){
		e.printStackTrace();
		
	}
	

	}

}
