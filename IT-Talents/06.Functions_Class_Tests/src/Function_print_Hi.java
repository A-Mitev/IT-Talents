import java.util.Scanner;

public class Function_print_Hi {

	static void printFunction(String hi, int a) {
		for (int i = 0; i < a; i++) {
			System.out.println(hi);

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String hi = "Hi";
		int a = scanner.nextInt();
		
		printFunction(hi, a);
	}

}
