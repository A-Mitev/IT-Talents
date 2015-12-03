import java.util.Scanner;

public class Simple_Task_2 {

	public static int multFunc(int firstNumber, int secondNumber) {
		if (firstNumber == 1) {
			return secondNumber;
		}

		return secondNumber + multFunc(firstNumber - 1, secondNumber);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		
		System.out.println(multFunc(firstNumber, secondNumber));
	}
}