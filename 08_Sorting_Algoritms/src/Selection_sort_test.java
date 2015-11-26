import java.util.Arrays;

public class Selection_sort_test {

	static void selectionSort(int[] array) {

		for (int index = 1; index < array.length; index++) {
			int maxIndex = 0;
			for (int j = 0; j <= array.length - index; j++) {
				if (array[j] > maxIndex) {
					maxIndex = j;
				}
			}
			int temp = array[maxIndex];
			array[maxIndex] = array[array.length - index];
			array[array.length - index] = temp;
		}
	}

	public static void main(String[] args) {
		int[] array = { 3, 2, 7, -2, -8, 23, 4, -5, 57 };
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
}
