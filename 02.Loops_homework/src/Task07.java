import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int input = scanner.nextInt();
		int result = 0;
		for (int index = 0; index < input ; index++) {
			System.out.print((result += 3) + ",");
		}
	}

}
