package ZapetajkiSEdinThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZapetajkiDemo {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(new File("war_peace.txt"));
		
		StringBuilder builder = new StringBuilder();
		while (scanner.hasNextLine()) {
			builder.append(scanner.nextLine());
		}
		String textForThread = builder.toString();

		long start = System.currentTimeMillis();

		Thread myThread = new Thread(new ThreadZapetajki(textForThread));
		myThread.start();

		System.out.println("Vreme za izpulnenie = " + (System.currentTimeMillis() - start));
	}
}
