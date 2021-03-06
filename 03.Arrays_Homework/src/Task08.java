import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter size of array.");
		int[] array = new int[scanner.nextInt()];
		System.out.println("Please enter digits for the array.");
		int countEqual = 1;
		int digit = 0;
		int maxRepeat = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 1; i < array.length; i++) {
			countEqual = 1;
			while (array[i] == array[i - 1]) {
				countEqual++;
				i++;
				if (i == array.length)
					break;
			}
			if (maxRepeat < countEqual) {
				maxRepeat = countEqual;
				digit = array[i - 1];
			}
		}

		System.out.print("The longest line is - ");
		for (int i = 0; i < countEqual; i++) {
			System.out.print(digit + " ");
		}
	}

}
