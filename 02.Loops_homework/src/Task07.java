import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		for (int i = 0; i < n ; i++) {
			System.out.print((result += 3) + ",");
		}
	}

}
