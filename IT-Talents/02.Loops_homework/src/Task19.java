import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		if ((num < 10) && (num > 99)) {
			System.out.println("Wrong input!");
			num = scanner.nextInt();
		}

		while (num != 1) {
			if (num % 2 == 0) {
				num *= 0.5;
				System.out.print(num + " ");
			} else {
				num = (num * 3) + 1;
				System.out.print(num + " ");
			}
		}
	}

}
