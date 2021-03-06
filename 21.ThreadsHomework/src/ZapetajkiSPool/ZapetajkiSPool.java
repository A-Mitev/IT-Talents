package ZapetajkiSPool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ZapetajkiSPool {

	private static final int COUNT_OF_DIFFERENT_THREADS = 5;

	public static void main(String[] args) throws InterruptedException, ExecutionException, FileNotFoundException {
		Scanner scanner = new Scanner(System.in);

		scanner = new Scanner(new File("war_peace.txt"));
		StringBuilder builder = new StringBuilder();

		while (scanner.hasNextLine()) {
			builder.append(scanner.nextLine());
		}
		String allElements = builder.toString();
		int partForAnalize = (allElements.length() / COUNT_OF_DIFFERENT_THREADS);

		long start = System.currentTimeMillis();

		ExecutorService pool = Executors.newFixedThreadPool(COUNT_OF_DIFFERENT_THREADS);

		List<Future> allCounts = new ArrayList<Future>();

		int startIndex = 0;
		for (int thread = 0; thread < COUNT_OF_DIFFERENT_THREADS; thread++) {

			String textToAnalize = allElements.substring(startIndex, (startIndex + partForAnalize));
			startIndex += partForAnalize;
			allCounts.add(pool.submit(() -> {
				String[] zapetajki = textToAnalize.replaceAll("^,", "").split(",");
				int count = zapetajki.length - 1;
				System.out.println(Thread.currentThread().getName() + " " + count);
				return count;
			}));
		}

		int result = 0;
		for (Future<Integer> count : allCounts) {
			result += count.get();
		}

		System.out.println("Obsht broj zapetajki = " + result);
		System.out.println("Vreme za obrabotka = " + (System.currentTimeMillis() - start));

		pool.shutdown();
	}
}
