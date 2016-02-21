package zapetajkiSPetThreada;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zapetajki {

	private static final int COUNT_OF_DIFFERENT_THREADS = 5;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(new File("war_peace.txt"));
		StringBuilder builder = new StringBuilder();

		while (scanner.hasNextLine()) {
			builder.append(scanner.nextLine());
		}
		String allElements = builder.toString();
		int partForAnalize = allElements.length() / COUNT_OF_DIFFERENT_THREADS;

		System.out.println("Celiqt text sudurza " + "\"" + allElements.length() + "\"" + " simvola.");
		System.out.println("Broj simvoli za edin tread " + "\"" + partForAnalize + "\"");

		long start = System.currentTimeMillis();

		int finalCount = 0;
		int startIndex = 0;
		for (int index = 0; index < COUNT_OF_DIFFERENT_THREADS; index++) {
			MyThread myThread = new MyThread(allElements.substring(startIndex, startIndex + partForAnalize));
			Thread thread = new Thread(myThread);
			thread.start();
			thread.join();
			finalCount += myThread.getValue();
			startIndex += partForAnalize;
		}

		System.out.println("Obsht broj zapetajki = " + finalCount);

		System.out.println("Time " + (System.currentTimeMillis() - start));
	}
}
