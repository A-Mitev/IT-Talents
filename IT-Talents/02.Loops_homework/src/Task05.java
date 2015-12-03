import java.util.Scanner;

public class Task05 {
	// Za test
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		
		for (int i = Math.min(firstNumber, secondNumber); i <= Math.max(firstNumber, secondNumber); i++) {
			System.out.println(i);
		}
		scanner.close();
	}

}
