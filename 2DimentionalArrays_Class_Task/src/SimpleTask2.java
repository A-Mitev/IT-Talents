import java.util.Scanner;

public class SimpleTask2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int arraySize = scanner.nextInt();
		int[] array = new int [arraySize];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		boolean nazuben = true;
		
		for (int i = 1; i <= array.length; i++) {
			if (array[i] == array.length){
				if ((array[i] > array[i -1]) || (array[i] < array[i + 1])){
					nazuben = true;
					break;
				} else {
					nazuben = false;
					break;
				}
			}
			if ((array[i] > array[i -1]) && (array[i] < array[i + 1])){
				nazuben = true;
			} else {
				nazuben = false;
				break;
			}
		}
		
		if (nazuben){
			System.out.println("The array is nazuben");
		} else {
			System.out.println("The array in not nazuben");
		}
	}

}
