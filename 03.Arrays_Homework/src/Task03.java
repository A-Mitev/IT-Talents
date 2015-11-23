import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		int[] array = new int[10];

		for (int index = 0; index < array.length; index++) {
			if (index < 2) {
				array[index] = input;
			} else {
				array[index] = (array[index - 1] + array[index - 2]);
			}
		}
		for (int index = 0; index < array.length; index++) {
			if (index < array.length - 1) {
				System.out.print(array[index] + ", ");
			}
			if (index == array.length - 1) {
				System.out.print(array[index]);
			}
		}
	}
}
