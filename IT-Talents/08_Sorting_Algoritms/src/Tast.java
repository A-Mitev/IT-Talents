import java.util.Arrays;

public class Tast {
	public static void main(String[] args) {

		int[] array = { 4, 3, 7, 8, 4, -1, 4, 2, 6,0};
		for (int i = 0; i < array.length / 2; i++) {
			for (int j = i; j < array.length - 1 - i; j++) {
				if (array[j] > array[array.length - 1 - i]) {
					int temp = array[array.length - 1 - i];
					array[array.length - 1 - i] = array[j];
					array[j] = temp;
				} else if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
			System.out.println(Arrays.toString(array));
		}
		System.out.println(Arrays.toString(array));
	}
}
