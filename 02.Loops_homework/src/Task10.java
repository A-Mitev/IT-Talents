import java.util.Scanner;

/**
 * @author A. Mitev
 * The info for how to find Prime number is form Wiki :
 * https://bg.wikipedia.org/wiki/%D0%9F%D1%80%D0%BE%D1%81%D1%82%D0%BE_%D1%87%D0%B8%D1%81%D0%BB%D0%BE
 *
 */
public class Task10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int devider = 2;
		int maxDevider = (int)Math.sqrt(number); // Kastvam kum int zashtoto Math.sqrt() vrushta double.
		boolean prime = true;

		while (prime && (devider <= maxDevider)) {
			if (number % devider == 0) {
				prime = false;
			}
			devider++;
		}
		if (prime) {
			System.out.println("This number is Prime!");
		} else {
			System.out.println("This number is not Prime!");
		}
	}
}
