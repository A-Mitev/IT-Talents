import java.util.Scanner;

public class Task24 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		int num = input;
		int reverseNum = 0;
		boolean isPalindrome;
		
		do {
			int lastDigit = num % 10;
			if (num >= 10){
				reverseNum = (reverseNum + lastDigit) * 10;
			} else {
			reverseNum += lastDigit;
			}
			num /= 10;
			
		} while (num > 0);
		
		if (input == reverseNum){
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}
		System.out.println("Is the number palindrome ? " + isPalindrome);
	}
}


