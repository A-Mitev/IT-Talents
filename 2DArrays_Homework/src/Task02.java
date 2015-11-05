import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		/* Za test! 
		 		int[][] array = { { 1, 4, 6, 3 }, { 5, 9, 7, 2 },
		                   			{ 4, 8, 1,9 }, { 2, 3, 4, 5 }, };*/
		 
		System.out.println("Please enter digitfor array size!");
		
		int arraySize = scanner.nextInt();
		int[][] array = new int [arraySize][arraySize];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j + i] + " ");
				break;
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j + (array.length - 1) - i] + " ");
				break;
			}
		}
	}

}
