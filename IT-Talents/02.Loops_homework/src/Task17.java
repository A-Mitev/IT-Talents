import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		String symbol = scanner.nextLine().trim();
		String star = "*";

		for (int i = 0; i < size; i++) {
			System.out.print(star);
		}

		System.out.println();

		for (int i = 0; i < (size - 2); i++) {
			for (int j = 0; j < size; j++) {
				if ((j == 0) || (j == (size - 1))) {
					System.out.print(star);
				} else {
					System.out.print(symbol);
				}
			}
			System.out.println();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(star);
		}
	}
}