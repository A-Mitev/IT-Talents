import java.util.Scanner;

public class Class_Task_2_11_9_2015 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int rows = scanner.nextInt();
		int cols = scanner.nextInt();

		int a[][] = new int[rows][cols];
		int num = 1;
		int maxNum = 1;

		for (int r1 = 0; r1 < rows; r1++) {
			int r = r1, c = 0;

			//fills one diagonal
			while (r >= 0 && c < cols) {
				if ( r1 < 2){
				a[r][c] = num;
				num++;
				r--;
				c++;
				if (num > maxNum){
					maxNum= num;
				}
				} else {
					if (r1 % 2 == 0){
						a[r][c] = (num + r1);
						num--;
						r--;
						c++;
						if (num > maxNum){
							maxNum= num;
						}
					} else {
						if (c == 0){
						num += maxNum;
						}
						if (r1 % 2 !=0){
							a[r][c] = num + r1 -1;
							num++;
							r--;
							c++;
							if (num > maxNum){
								maxNum= num;
							}
						}
					}
					
				}
			}
		}
		
		for (int c1 = 1; c1 < cols; c1++) {
			int r = rows-1, c = c1;
			
			//fills one diagonal
			while (r >= 0 && c < cols) {
				a[r][c] = num;
				num++;
				r--;
				c++;
			}
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}
}