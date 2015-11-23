import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int arraySize = 10;
		float[] array = new float[arraySize];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextFloat();
		}

		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ", ");
		}
		System.out.println();

		for (int index = 0; index < array.length; index++) {
			if (array[index] < -0.231) {
				array[index] = (float) (Math.pow(index + 1, 2) + 41.25);
			} else {
				array[index] = array[index] * (index + 1);
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}
