import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		int[][] array = new int[row][col];
		
		for (int row1 = 0; row1 < array.length; row1++) {
			for (int col1 = 0; col1 < array[row1].length; col1++) {
				array[row1][col1] = scanner.nextInt();
			}
		}
		int sum = 0;
		for (int row2 = 0; row2 < array.length; row2 ++) {
			for (int col2 = 0; col2 < array[row2].length; col2++) {
				sum += array[row2][col2];
			}
			System.out.println();
		}	
		System.out.println(sum);
	}
}
