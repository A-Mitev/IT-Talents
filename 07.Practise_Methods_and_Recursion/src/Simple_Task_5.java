import java.util.Scanner;

public class Simple_Task_5 {

	static int reverceFunc(int input) {
		if (input < 10) {
			//System.out.println(input);
			return input;
		} else {
			input /= 10;
		}
		return reverceFunc(input % 10);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		System.out.println(reverceFunc(input));

		 if (input == reverceFunc(input)) {
		 System.out.println("Yes");
		 } else {
		 System.out.println("No");
		 }

	}

}
