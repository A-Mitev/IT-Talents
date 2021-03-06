import java.util.Scanner;

public class Task_03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter two successive Strings without spaces.");
		String firstSymbols = scanner.next();
		String secondSymbols = scanner.next();

		System.out.println("Please enter two Strings positions.");
		int firstPosition = scanner.nextInt();
		int secondPosition = scanner.nextInt();

		int longestRow = Math.max(firstSymbols.length(), secondSymbols.length());

		if ((firstSymbols.length() > secondSymbols.length()) && firstSymbols.length() == longestRow) {
			System.out.println("First String is longer.");
		}
		if ((secondSymbols.length() > firstSymbols.length()) && (secondSymbols.length() == longestRow)) {
			System.out.println("Second String is longer.");
		}
		if (firstSymbols.length() == secondSymbols.length()) {
			System.out.println("Two String are with equal length.");
		}

		System.out.println("Difference by positions:");

		//Proverka za nevalini pozicii.
		while (!(firstPosition >= 1 && (firstPosition <= firstSymbols.length() || firstPosition <= secondSymbols.length()))
				|| !(secondPosition >= 1 && (secondPosition <= firstSymbols.length() || secondPosition <= secondSymbols.length()))) {
			System.out.println("Non-existing position. Please try again.");
			firstPosition = scanner.nextInt();
			secondPosition = scanner.nextInt();
		}

		System.out.println(firstPosition + " " + firstSymbols.charAt(firstPosition - 1) + "-"
				+ secondSymbols.charAt(firstPosition - 1));

		System.out.println(secondPosition + " " + firstSymbols.charAt(secondPosition - 1) + "-"
				+ secondSymbols.charAt(secondPosition - 1));
	}

}
