import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int [7];
		int smallestNum = Integer.MAX_VALUE;
		
		for (int index = 0; index < array.length; index++) {
			array [index] = scanner.nextInt();
		}
		
		for (int index = 0; index < array.length; index++) {
			if ((array[index] < smallestNum) && (array[index] % 3 == 0)){
				smallestNum = array[index];
			}
		}
		System.out.println(smallestNum);
	}
}
