import java.util.Scanner;

public class Task_08 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String input = scanner.next();
		boolean palindrom = false;
		int inputLength = input.length();
		if (inputLength % 2 != 0) {
			for (int i = 0; i < (input.length() / 2) + 1; i++) {
				if (input.charAt(i) == input.charAt(inputLength - 1)) {
					palindrom = true;
					inputLength--;
				} else {
					palindrom = false;
				}
			}
		} else {
			for (int i = 0; i < input.length() / 2; i++) {
				if (input.charAt(i) == input.charAt(inputLength - 1)) {
					palindrom = true;
					inputLength--;
				} else {
					palindrom = false;
				}
			}
		}
		
		if(palindrom){
			System.out.println("Da.");
		} else {
			System.out.println("Ne.");
		}
	}
}
