import java.util.Arrays;

public class Quick_Sort {

	static int partition(int[] array, int l, int r) {
		int randIndex = (int) (Math.random() * (r - l) + l);

		int temp = array[r];
		array[r] = array[randIndex];
		array[randIndex] = temp;

		int k = l - 1;
		int pivot = array[r];

		for (int index = l; index <= r; index++) {
			if (array[index] <= pivot) {
				k++;

				temp = array[index];
				array[index] = array[k];
				array[k] = temp;
			}
		}
		return k;
	}

	static void quickSort(int[] array, int l, int r) {
		if (l >= r) {
			return;
		}
		int k = partition(array, l, r);
		quickSort(array, l, k - 1);
		quickSort(array, k + 1, r);
	}

	public static void main(String[] args) {
		int[] array = { 4, 1, 3, 2, 4, 5, 6, 4, 6, 7, 4, 0, 6, 7, 4, 2, 5, 7 };
		quickSort(array, 0, array.length - 1);

		System.out.println(Arrays.toString(array));
	}
}
