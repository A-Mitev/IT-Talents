import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int arraySize = 7;
		int[] array = new int[arraySize];
		int sum = 0; // neobhodima za presmqtane na srednata stojnost
		int average;

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		average = sum / array.length;

		System.out.println("Average value " + average);

		/*
		 * nachina za namirane na naj-blizkoto chislo e ot
		 * http://stackoverflow.com/questions/13318733/get-closest-value-to-a-
		 * number-in-array prisposoben da raboti s dannite do tuk
		 */

		int distance = Math.abs(array[0] - average);
		int start = 0;
		for (int i = 1; i < array.length; i++) {
			int closest = Math.abs(array[i] - average);
			if (closest < distance) {
				start = i;
				distance = closest;
			}
		}
		int theClosest = array[start];

		System.out.println("The closest number is " + theClosest);

	}

}
