import java.util.Arrays;

public class SimpleTask4 {
	public static void main(String[] args) {
		int[] array = { 0, 1, 1, 0, 1, 0, 0, 1, 1 };
		int[] newArray = new int [array.length];
		
		// Arrays.sort(array);
		// for (int i = 0; i < array.length; i++) {
		// System.out.print(array[i] + " ");
		// }

		int count = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (array[i] == 0) {
				newArray[count] = 0;
				count++;
			}
		}
		for (int j = 0; j < newArray.length; j++) {
			if (array[j] > 0) {
				newArray[count] = 1;
				count++;
			}
		}
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]);
		}
	}
}
