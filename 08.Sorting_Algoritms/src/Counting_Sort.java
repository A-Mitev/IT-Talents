import java.util.Arrays;

public class Counting_Sort {

	public static int[] countingSort(int[] numbers, int maxNumber) {
		int[] counts = new int[maxNumber + 1];

		for (int index = 0; index < numbers.length; index++) {
			counts[numbers[index]]++;
		}
		int[] results = new int[numbers.length];

		int counter = 0;
		for (int index = 0; index <= counts.length - 1; index++) {
			while (counts[index] > 0) {
				results[counter++] = index;
				counts[index]--;
			}
		}
		return results;
	}

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 3, 6, 8, 5, 2, 4, 6, 8 };
		int maxNumber = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > maxNumber) {
				maxNumber = numbers[index];
			}
		}
		System.out.println(Arrays.toString(countingSort(numbers, maxNumber)));
	}
}
