import java.util.Scanner;

public class Task_05 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter two separate words.");

		String firstWord = scanner.next();
		String secondWord = scanner.next();

		for (int i = 0; i < firstWord.length(); i++) {
			if (firstWord.charAt(i) == secondWord.charAt(0)) {
				System.out.print(secondWord + "\n");
			} else {
				System.out.println(firstWord.charAt(i));
			}
		}
	}

}
