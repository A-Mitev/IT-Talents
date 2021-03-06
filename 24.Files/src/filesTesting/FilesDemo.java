package filesTesting;

import java.io.File;
import java.io.IOException;

public class FilesDemo {
	
	public static void main(String[] args) throws IOException {
		File mainFolder = new File("test");
		File file = new File(mainFolder + File.separator + "banici.txt");
		if(file.exists()){
			System.out.println("Sushtestvuva");
		}else {
			System.out.println("Nqma go");
		}
		
		File mynewFile = new File(mainFolder + File.separator + "banici.txt");
		mynewFile.createNewFile();
		
		File myNewDir = new File(mainFolder, "novaPapka6" + File.separator + "novaPapka7" + File.separator + "novaPapka9");
		myNewDir.mkdir();
		
		myNewDir.mkdirs();
		
		System.out.println(mynewFile.isFile());
		
		File[] files = mainFolder.listFiles();
		for(File file3 : files){
			System.out.println(file3.getName());
		}
		
		
	}

}
