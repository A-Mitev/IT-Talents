import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter array size bigger than 3.");

		int arraySize = scanner.nextInt();

		while (arraySize < 3) {
			System.out.println("The array size must be ");
			arraySize = scanner.nextInt();
		}

		double[] array = new double[arraySize];
		double[] maxValueNumbers = new double[3];

		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.nextDouble();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = array[i] * -1;
			}
		}

		// Arrays.sort(array) // Za po lesno moze da se polzva tazi funkciq.

		// Tuk sortiram masiva.
		double temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		int count = 2;
		int countNewArray = 1;
		double maxValue = array[array.length - 1];
		maxValueNumbers[0] = maxValue;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != maxValue) {
				maxValue = array[i];
				maxValueNumbers[countNewArray] = maxValue;
				countNewArray++;
				count--;
				if (count == 0) {
					break;
				}
			}
		}

		for (int i = maxValueNumbers.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(maxValueNumbers[i]);
				break;
			}
			System.out.print(maxValueNumbers[i] + "; ");
		}
	}
}
