import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number for array size.");
		int[] array = new int[scanner.nextInt()];
		int[] newArray = new int[array.length];

		System.out.println("Please enter digits for the array");
		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.nextInt();
		}

		
		for (int index = 0; index < newArray.length; index++) {
			if (index == 0) {
				newArray[index] = array[index + 1];     // Because there is no previous value it is set to get only the next value.
			} else if (index == newArray.length - 1) {
				newArray[index] = array[index - 1];     // Because there is no next value it is set to get only previous value.
			} else {
				newArray[index] = (array[index - 1] + array[index + 1]);
			}
		}

		for (int index  = 0; index < newArray.length; index++) {
			System.out.print(newArray[index] + " ");
		}
	}
}
