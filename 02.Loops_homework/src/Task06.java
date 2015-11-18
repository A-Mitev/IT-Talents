import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		int sum = 0;
		for (int index = 1; index <= input; index++) {
			sum += index;
		}
		System.out.println(sum);
		scanner.close();
	}

}
