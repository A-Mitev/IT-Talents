import java.util.Arrays;

public class Bubble_Sort_Test {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 3, 8, 6, 1, 9 };
		int iteration = 0;

		for (int i = 0; i < array.length; i++) {
			boolean isSorted= true;
			for (int index = 0; index < array.length - 1; index++) {
				if (array[index] > array[index + 1]) {
					int temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
					isSorted = false;
					iteration++;
				}
			}
			if (isSorted){
				break;
			}
		}

		System.out.println(Arrays.toString(array));
		System.out.println(iteration);
	}

}
