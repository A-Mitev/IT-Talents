import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int sum =0;
		
		for (int index = numberA; index < numberB; index++) {
			if (index % 3 == 0){
				System.out.print("Skip 3" + ", ");
				continue;
			}
			System.out.print((int)Math.pow(index, 2) + ", ");
			sum += (int)Math.pow(index, 2);
			if (sum > 200){
				break;
			}
		}
		System.out.println("\n" + sum);
	}

}
