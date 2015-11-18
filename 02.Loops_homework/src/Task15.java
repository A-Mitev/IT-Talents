import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		
		int input = scanner.nextInt();
		int sum = 1;
		int currentNum = 1;
		do {
			sum += ++currentNum;
		} 
		while (currentNum < input);
		System.out.println(sum);
	}

}
