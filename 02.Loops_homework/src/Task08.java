import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		for (int index = 0; index < input * 2; index++) {
			for (int j = 0; j < input; j++) {
				System.out.print((index + input) - 1);

			}
			System.out.println();
			index += 1;

		}
	}

}
