package ZapetajkiSEdinThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZapetajkiThread implements Runnable {

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		try {
			scanner = new Scanner(new File("war_peace.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuilder builder = new StringBuilder();
		
		

		while (scanner.hasNextLine()) {
			builder.append(scanner.nextLine());
		}
		
		long start = System.currentTimeMillis();
		
		String[] zapetajki = builder.toString().replaceAll("^,", "").split(",");

		int zapetajkiCount = zapetajki.length -1;
		System.out.println(zapetajkiCount);
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}
}
