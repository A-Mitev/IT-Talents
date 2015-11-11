import java.util.Scanner;

public class SimpleTasks1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int arraySize = scanner.nextInt();
		int[] array = new int [arraySize];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		boolean allPositive = true;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0){
				allPositive = false;
				break;
			}
		}
		
		System.out.println("Are all numbers positive? - " + allPositive);
		
	}

}
