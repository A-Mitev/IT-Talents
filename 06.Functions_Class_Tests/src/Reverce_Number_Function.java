import java.util.Scanner;

public class Reverce_Number_Function {

	static void reverceFunction(int firstNumber, int scondNumber) {
		firstNumber = firstNumber + scondNumber;
		scondNumber = firstNumber - scondNumber;
		firstNumber = firstNumber - scondNumber;

		//System.out.println(firstNumber + " " + scondNumber);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber = scanner.nextInt();
		int scondNumber = scanner.nextInt();

		reverceFunction(firstNumber, scondNumber);
	}
}
