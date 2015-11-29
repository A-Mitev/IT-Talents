import java.util.Arrays;

public class Quick_Sort_Test {

	static int partition(int[] array, int l, int r) {
		int k = l -1;
		int pivot = array[r];

		for (int index = l; index <= r; index++) {
			if (array[index] <= pivot) {
				k++;
				int temp = array[index];
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
		int[] array = { 3, 1, 2, 1, 2, 3, 4, 6, 2, 4, 5, 3, 5, 4, 3 };
		quickSort(array, 0, array.length -1);
		System.out.println(Arrays.toString(array));
	}
}
