import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();

		for (int i = 100; i < 1000; i++) {
			int firrstDigit = (i / 100) % 10;
			int secondDigit = (i / 10) % 10;
			int thirdDigit = i % 10;

			if (2 <= sum && sum <= 27) {
				if (firrstDigit + secondDigit + thirdDigit == sum) {
					System.out.print(i + ", ");
				} else {
					continue;
				}
			} else {
				System.out.println("Wrong input!");
				break;   // bez break saobshtenieto se printira nqkolko puti
			}
		}
	}
}
