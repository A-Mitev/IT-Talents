import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int arraySize = 7;
		int[] array = new int[arraySize];

		System.out.println("Please enter 7 digits!");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Example: ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();

		int indexZeroBuffer = array[0];
		array[0] = array[1];
		array[1] = indexZeroBuffer;

		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];

		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];

		System.out.print("Result:  ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}
}
