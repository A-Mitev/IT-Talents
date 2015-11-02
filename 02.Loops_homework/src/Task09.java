import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum =0;
		
		for (int i = a; i < b; i++) {
			if (i % 3 == 0){
				System.out.print("Skip 3" + ", ");
				continue;
			}
			System.out.print((int)Math.pow(i, 2) + ", ");
			sum += (int)Math.pow(i, 2);
			if (sum > 200){
				break;
			}
		}
		System.out.println("\n" + sum);
	}

}
