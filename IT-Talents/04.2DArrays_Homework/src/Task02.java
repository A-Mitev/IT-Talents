import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		/* Za test! 
		 		int[][] array = { { 1, 4, 6, 3 }, { 5, 9, 7, 2 },
		                   			{ 4, 8, 1,9 }, { 2, 3, 4, 5 }, };*/
		 
		System.out.println("Please enter digit for array size!");
		
		int arraySize = scanner.nextInt();
		int[][] array = new int [arraySize][arraySize];
		
		for (int index = 0; index < array.length; index++) {
			for (int j = 0; j < array[index].length; j++) {
				array[index][j] = scanner.nextInt();
			}
		}
		
		for (int index = 0; index < array.length; index++) {
			for (int j = 0; j < array[index].length; j++) {
				System.out.print(array[index][j + index] + " ");
				break;
			}
		}
		System.out.println();
		for (int index = 0; index < array.length; index++) {
			for (int j = 0; j < array[index].length; j++) {
				System.out.print(array[index][j + (array.length - 1) - index] + " ");
				break;
			}
		}
	}

}
