package ClassTask;

import java.io.File;
import java.io.IOException;

public class Task1 {
	public static void main(String[] args) throws IOException {
		
		File dir = new File("iotest");
		if(dir.exists()){
			System.out.println("Ima q nqma da suzdavam");
		} else {
			dir.mkdir();
		}
		
		File newFile = new File(dir + File.separator + "test.txt");
		newFile.createNewFile();
		
		File[] allFiles = dir.listFiles();
		for(File file3: allFiles){
			if(file3.getName().startsWith("t")){
				file3.delete();
			}
			
		}
		
		
	}
}
