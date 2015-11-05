import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[8];
		int[] newArray = new int[array.length];
		int[] arrayBuffer = new int[newArray.length / 2];
		int reverce = arrayBuffer.length;

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < newArray.length / 2; i++) {
			newArray[i] = array[i];
		}

		for (int i = arrayBuffer.length - 1; i >= 0; i--) {
			arrayBuffer[i] = newArray[i];
		}

		for (int i = 0; i < arrayBuffer.length; i++) {
			System.out.println(arrayBuffer[i]);
		}

		for (int i = newArray.length / 2; i <= newArray.length - 1; i++) {
			newArray[i] = arrayBuffer[reverce - 1];
			reverce--;
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]);
		}

	}

}
