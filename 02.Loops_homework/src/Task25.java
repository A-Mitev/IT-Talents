import java.util.Scanner;

public class Task25 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int factorial = 1;
		int count = 1;
		
		do {
			factorial *= count;
			count++;
		} while (count <= input);
		System.out.println(factorial);
	}

}
