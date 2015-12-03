import java.util.Arrays;
import java.util.Scanner;

public class Task_12 {

	static void arrayFunction(int arraySize) {
		int[] array = new int[arraySize];
		for (int index = 0; index < array.length; index++) {
			array[index] = index + 1;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter array size:");
		int arraySize = scanner.nextInt();
		
		arrayFunction(arraySize);
		
		scanner.close();
	}
}
