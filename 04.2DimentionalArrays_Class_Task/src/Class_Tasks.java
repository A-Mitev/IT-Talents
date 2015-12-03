import java.util.Scanner;

public class Class_Tasks {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		int[][] array = new int [row][col];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
	}

}
