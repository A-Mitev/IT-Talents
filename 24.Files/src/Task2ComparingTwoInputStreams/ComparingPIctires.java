package Task2ComparingTwoInputStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ComparingPIctires {
	public static void main(String[] args) throws IOException {
	
	
	File dir = new File("iotest");
	File file = new File("firstPic.jpg");
	File file2 = new File("secondPic.jpg");
	
	try {
		InputStream first = new FileInputStream(dir + File.separator + file);
		InputStream second = new FileInputStream(dir + File.separator + file2);
		
		if(file.length() != file2.length()){
			System.out.println("Ne sa ednakvi");
		}
		
		int b1 = first.read();
		int b2 = second.read();
		
		do {
			if(b1 != b2){
				System.out.println("Ne sa ednakvi");
			}
		} while (b1 != -1);
		
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
}
