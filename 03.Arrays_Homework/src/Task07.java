import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number for array size.");
		int[] array = new int[scanner.nextInt()];
		int[] newArray = new int[array.length];

		System.out.println("Please enter digits for the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < newArray.length; i++) {
			if (i == 0) {
				newArray[i] = array[i + 1];     // Because there is no previous value it is set to get only the next value.
			} else if (i == newArray.length - 1) {
				newArray[i] = array[i - 1];     // Because there is no next value it is set to get only previous value.
			} else {
				newArray[i] = (array[i - 1] + array[i + 1]);
			}
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}
